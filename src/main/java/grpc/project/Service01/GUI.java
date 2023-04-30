package grpc.project.Service01; 

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver; 

import javax.swing.*;

import grpc.project.Service01.RequestRFIDMsg.Builder;
import grpc.project.Service01.SecurityRequestServiceGrpc;



public class GUI {
   private static SecurityRequestServiceGrpc.SecurityRequestServiceBlockingStub blockingStub; 
   public static void main (String args[]) { 
	   ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();
	   blockingStub = SecurityRequestServiceGrpc.newBlockingStub(channel); 
	   rfid(); 
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
} 
