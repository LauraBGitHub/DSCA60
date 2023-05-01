package grpc.project.Service03;

import io.grpc.ManagedChannel; 
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
//implementation and GUI imports 
import java.util.Random;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

import grpc.project.Service01.RequestDoorAccessMsg;
import grpc.project.Service03.IncidentResponseGrpc;
import grpc.project.Service03.IncidentResponseGrpc.IncidentResponseBlockingStub;

@SuppressWarnings("unused")
public class Service03Client { 
	//adding stubs
	private static IncidentResponseGrpc.IncidentResponseBlockingStub blockingStub;
	private static IncidentResponseGrpc.IncidentResponseStub asyncStub; 
	// adding GUI buttons
	private static JFrame frame;
	private static JButton blockButton;
    private static JButton incidentButton;
    
	public static void main (String[] args) throws InterruptedException { 
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091)
		.usePlaintext()
		.build(); 
		//create the stubs
		blockingStub = IncidentResponseGrpc.newBlockingStub(channel);
		asyncStub = IncidentResponseGrpc.newStub(channel);
		//USE GUI instead of calling the methods directly 
	
		//blockAccess(); 
		//incidentResponse(); 
		frame = new JFrame("Service03Client");
        blockButton = new JButton("Block Access");
        incidentButton = new JButton("Incident Response");
        blockButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blockAccess();
            }
        });
        incidentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    incidentResponse();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // add the components to the frame and show it
        frame.setLayout(new FlowLayout());
        frame.add(blockButton);
        frame.add(incidentButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
		
	 }
	public static void blockAccess() {
		JFrame f;
	    f = new JFrame();
	    String user = JOptionPane.showInputDialog(f, "Enter UserName");
	    boolean flag = JOptionPane.showInputDialog(f, "Enter true to add secure flag") != null;
		BlockAccessMessage request = BlockAccessMessage.newBuilder().setUserId(user).setSecureFlag(flag).build(); 
		
		BlockAccessResponseMessage response = blockingStub.blockAccess(request); 
		System.out.println(user + response.getResult());
	}
	public static void incidentResponse() throws InterruptedException { 
		StreamObserver<SuggestIncidentResponseMsg> responseObserver = new StreamObserver<SuggestIncidentResponseMsg>() {

			@Override
			public void onNext(SuggestIncidentResponseMsg value) {
				System.out.println("entered: " + value.getKeyId() + " , "+value.getResponse());
				
			}

			@Override
			public void onError(Throwable t) {
				System.err.println("Error processing request: " + t.getMessage());
			    t.printStackTrace();
				
			}

			@Override
			public void onCompleted() {
				System.out.println("server completed");
				
			}
			
		}; 
		 StreamObserver<SuggestIncidentRequest> requestObserver = asyncStub.suggestIncidentResponse(responseObserver);
		try { 
			requestObserver.onNext(SuggestIncidentRequest.newBuilder().setAccessFailConditionTrips("User security level mismatch ").build());
			requestObserver.onNext(SuggestIncidentRequest.newBuilder().setAccessFailConditionTrips("Security level doesnt match to employment type ").build());
			requestObserver.onNext(SuggestIncidentRequest.newBuilder().setAccessFailConditionTrips("User verification required ").build());
			System.out.println("SENDING MESSAGES");
			requestObserver.onCompleted();
			
			Thread.sleep(new Random().nextInt(1000) + 500);
		}
		catch (RuntimeException e) {
			e.printStackTrace();
		}
	}
	
}
		