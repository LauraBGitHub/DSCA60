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

import java.util.logging.Logger;
import java.util.Iterator;
//GUI imports 
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;


public class Service02Client { 
	private static  Logger logger = Logger.getLogger(Service02Client.class.getName());
	
	private static AccessControlGrpc.AccessControlBlockingStub blockingStub;
	private static JFrame frame;
	private static JButton setProfile;
    private static JButton setApproval;
    private static JButton set2FA;
	
	public static void main (String[] args) { 
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
		.usePlaintext()
		.build(); 
		//create the stubs
		blockingStub = AccessControlGrpc.newBlockingStub(channel);
		//Using GUI instead of calling the methods directly
		//setProfile();
		//setApproval();
		//set2FA(); 
		frame = new JFrame("Service02Client");
        setProfile = new JButton("Set Profile");
        setApproval = new JButton("Set Approval");
        set2FA = new JButton("Set 2FA");
        setProfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setProfile();
            }
        });
        setApproval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setApproval();
            }
        });
        set2FA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                set2FA(); 
            }
        });

        // add the components to the frame and show it
        frame.setLayout(new FlowLayout());
        frame.add(setProfile);
        frame.add(setApproval);
        frame.add(set2FA);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
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
	public static void set2FA() { 
		RequestTwoFAMsg request = RequestTwoFAMsg.newBuilder().setUserId("E2365651").build(); 
		String userID = "E2365651  : "; 
		RequestTwoFAResponse response = blockingStub.requestTwoFA(request); 
		System.out.println(userID + response.getResult()); 
	}

}

