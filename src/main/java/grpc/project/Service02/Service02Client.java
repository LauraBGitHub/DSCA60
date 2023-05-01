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
		
		JFrame f;
	    f = new JFrame();
	    String user = JOptionPane.showInputDialog(f, "Enter UserName");
	    String securityLevel = JOptionPane.showInputDialog(f, "Enter Security level ...");
	    boolean flag = JOptionPane.showInputDialog(f, "Enter true to add secure flag") != null;
	    String employment = JOptionPane.showInputDialog(f, "Enter Employment Type");
		// First creating a request message. Here, the message contains a string in setVal
		SetSecurityProfileRequest request = SetSecurityProfileRequest.newBuilder()
	            .setUserId(user)
	            .setSecurityLevel(securityLevel)
	            .setSecureFlag(flag)
	            .setEmploymentType(employment)
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
		JFrame f;
	    f = new JFrame();
	    String user = JOptionPane.showInputDialog(f, "Enter UserName");
		VerifyPreApprovalMsg request = VerifyPreApprovalMsg.newBuilder().setUserId(user).build(); 
		
		VerifyPreApprovalResponse response = blockingStub.verifyPreApproval(request); 
		System.out.println(user + response.getResult());
	}
	public static void set2FA() { 
		JFrame f;
	    f = new JFrame();
	    String user = JOptionPane.showInputDialog(f, "Enter UserName");
		RequestTwoFAMsg request = RequestTwoFAMsg.newBuilder().setUserId(user).build(); 
		
		RequestTwoFAResponse response = blockingStub.requestTwoFA(request); 
		System.out.println(user + response.getResult()); 
	}

}

