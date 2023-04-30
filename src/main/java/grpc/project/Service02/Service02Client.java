package grpc.project.Service02; 
//import files 
import grpc.project.Service02.AccessControlGrpc;
import grpc.project.Service02.AccessControlGrpc.AccessControlBlockingStub;
//import GRPC packages
import io.grpc.ManagedChannel; 
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Iterator;


public class Service02Client { 
	private static  Logger logger = Logger.getLogger(Service02Client.class.getName());
	
	private static AccessControlGrpc.AccessControlBlockingStub blockingStub;
	
	public static void main (String[] args) { 
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
		.usePlaintext()
		.build(); 
		//create the stubs
		blockingStub = AccessControlGrpc.newBlockingStub(channel);
		setProfile();
		setApproval(); 
		channel.shutdown();
	 }
	public static void setProfile() { 
		
	
		// First creating a request message. Here, the message contains a string in setVal
		SetSecurityProfileRequest request = SetSecurityProfileRequest.newBuilder()
	            .setUserId("E676353")
	            .setSecurityLevel("Low Level")
	            .setSecureFlag(false)
	            .setEmploymentType("Fixed Term Employee")
	            .build(); 
		
			try {
				// Iterating each message in response when calling remote split RPC method.
				Iterator<SetSecurityProfileResponse> responces = blockingStub.setSecurityProfile(request);
				
				// Client keeps a check on the next message in stream.
				while(responces.hasNext()) {
					SetSecurityProfileResponse temp = responces.next();
					System.out.println(temp.getUserId());	
					System.out.println(temp.getSecurityLevel());
					System.out.println(temp.getTwoFactorAuth());
					System.out.println(temp.getDateSet());
				}

			} catch (StatusRuntimeException e) {
				e.printStackTrace();
			}
	}
	
	public static void setApproval() { 
		VerifyPreApprovalMsg request = VerifyPreApprovalMsg.newBuilder().setUserId("E7678987").build(); 
		String userID = "E7678987  : "; 
		VerifyPreApprovalResponse response = blockingStub.verifyPreApproval(request); 
		System.out.println(userID + response.getResult());
	}

}

