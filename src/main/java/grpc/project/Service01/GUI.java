package grpc.project.Service01; 

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Random;

//GUI imports 
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;


public class GUI {
   private static SecurityRequestServiceGrpc.SecurityRequestServiceBlockingStub blockingStub; 
   private static SecurityRequestServiceGrpc.SecurityRequestServiceStub asyncStub;
   private static JFrame frame;
	private static JButton rfidRequest;
   private static JButton getProfile;
   private static JButton codeRequest;
   public static void main (String args[]) throws InterruptedException { 
	   ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
	   blockingStub = SecurityRequestServiceGrpc.newBlockingStub(channel); 
	   asyncStub = SecurityRequestServiceGrpc.newStub(channel);
	   //Using GUI - Java Swing 
	   frame = new JFrame("Service01Client");
	    rfidRequest = new JButton("RFID");
	    getProfile = new JButton("Get Security Profile");
	    codeRequest = new JButton("Door Access Code");
	    rfidRequest.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            rfid();
	        }
	    });
	    getProfile.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            getProfile();
	        }
	    });
	    codeRequest.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            try {
					doorAccess();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 
	        }
	    });

	    // add the components to the frame and show it
	    frame.setLayout(new FlowLayout());
	    frame.add(rfidRequest);
	    frame.add(getProfile);
	    frame.add(codeRequest);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setVisible(true); 
   }
   
   public static void rfid() { 
	   JFrame f;
       f = new JFrame();
       String RFID = JOptionPane.showInputDialog(f, "Enter RFID CODE");
       RequestRFIDMsg.Builder requestBuilder = RequestRFIDMsg.newBuilder().setCode(RFID); 
       RequestRFIDMsg request = requestBuilder.build();
       try {
       ResponseAccess reponse = blockingStub.requestRFID(request); 
       System.out.println(reponse);
       } 
       catch (StatusRuntimeException e) {
		e.printStackTrace();
       }  
   }
   public static void getProfile() { 
	   JFrame f = new JFrame();
       String user = JOptionPane.showInputDialog(f, "Enter Username");
	   RequestSecProfile request = RequestSecProfile.newBuilder().setUserId(user).build(); 
	   try {
		   SecurityProfile response = blockingStub.requestSecurityProfile(request); 
		   System.out.println("User: "+user);
		   System.out.println("Level: "+response.getSecurityLevel());	
		   System.out.println("Flag: "+response.getSecureFlag());
		   System.out.println("2FA: "+response.getTwoFactorAuth());
		   System.out.println("Type: "+response.getEmploymentType());
		   System.out.println("Date: "+response.getAccessDate());
		
	   }
	   catch (StatusRuntimeException e) {
			e.printStackTrace();
	       } 
   }
   public static void doorAccess() throws InterruptedException { 
	   StreamObserver<ResponseAccess> responseObserver = new StreamObserver<ResponseAccess>() {

		@Override
		public void onNext(ResponseAccess value) {
			System.out.println("Recieving Access: " + value.getAccessResponse());
			
		}

		@Override
		public void onError(Throwable t) {
			System.err.println("Error processing request: " + t.getMessage());
		    t.printStackTrace();
			
		}

		@Override
		public void onCompleted() {
			System.out.println("completed ");
			
		}
		   
	   }; 
	   StreamObserver<RequestDoorAccessMsg> requestObserver = asyncStub.requestDoorAccess(responseObserver);
	   try { 
		   JFrame f;
	       f = new JFrame();
	       String pin = JOptionPane.showInputDialog(f, "Enter pin (723031) ");
		   requestObserver.onNext(RequestDoorAccessMsg.newBuilder().setDoorId("D21").build());
		   requestObserver.onNext(RequestDoorAccessMsg.newBuilder().setPin(pin).build());
		   
		   System.out.println("SENDING MESSAGES");
		   
		   requestObserver.onCompleted();
		   Thread.sleep(new Random().nextInt(1000) + 500);
	   } 
	   catch (RuntimeException e) {
			e.printStackTrace();
		}
   }


} 
