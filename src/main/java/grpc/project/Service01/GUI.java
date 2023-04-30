package grpc.project.Service01; 

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.Random;

import javax.swing.*;

import grpc.project.Service01.RequestRFIDMsg.Builder;
import grpc.project.Service02.VerifyPreApprovalResponse;
import grpc.project.Service01.SecurityRequestServiceGrpc;



public class GUI {
   private static SecurityRequestServiceGrpc.SecurityRequestServiceBlockingStub blockingStub; 
   private static SecurityRequestServiceGrpc.SecurityRequestServiceStub asyncStub;
   public static void main (String args[]) throws InterruptedException { 
	   ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
	   blockingStub = SecurityRequestServiceGrpc.newBlockingStub(channel); 
	   asyncStub = SecurityRequestServiceGrpc.newStub(channel);
	   rfid(); 
	   doorAccess(); 
	   getProfile(); 
	   channel.shutdown(); 
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
			// TODO Auto-generated method stub
			
		}

		@Override
		public void onCompleted() {
			System.out.println("completed ");
			
		}
		   
	   }; 
	   StreamObserver<RequestDoorAccessMsg> requestObserver = asyncStub.requestDoorAccess(responseObserver);
	   try { 
		   requestObserver.onNext(RequestDoorAccessMsg.newBuilder().setDoorId("D21").build());
		   requestObserver.onNext(RequestDoorAccessMsg.newBuilder().setPin("743031").build());
		   requestObserver.onNext(RequestDoorAccessMsg.newBuilder().setPin("743031").build());
		   System.out.println("SENDING MESSAGES");
		   
		   requestObserver.onCompleted();
		   Thread.sleep(new Random().nextInt(1000) + 500);
	   } 
	   catch (RuntimeException e) {
			e.printStackTrace();
		}
   }


} 
