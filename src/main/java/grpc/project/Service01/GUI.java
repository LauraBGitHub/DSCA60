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
       catch(StatusRuntimeException ex) {
			// Print if any error/exception is generated.
			System.out.println( ex.getMessage());
			
		}
       
   }
} 
