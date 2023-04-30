package grpc.project.Service03;

import io.grpc.ManagedChannel; 
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
//implementation and GUI imports 
import java.util.Random;
import javax.swing.*;
import java.awt.event.*;

import grpc.project.Service01.RequestDoorAccessMsg;
import grpc.project.Service03.IncidentResponseGrpc;
import grpc.project.Service03.IncidentResponseGrpc.IncidentResponseBlockingStub;

@SuppressWarnings("unused")
public class Service03Client extends JFrame implements ActionListener  { 
	//adding stubs
	private static IncidentResponseGrpc.IncidentResponseBlockingStub blockingStub;
	private static IncidentResponseGrpc.IncidentResponseStub asyncStub; 
	// adding GUI buttons
	private JButton button1;
    private JButton button2;
    
	public static void main (String[] args) throws InterruptedException { 
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091)
		.usePlaintext()
		.build(); 
		//create the stubs
		blockingStub = IncidentResponseGrpc.newBlockingStub(channel);
		asyncStub = IncidentResponseGrpc.newStub(channel);
		//USE GUI instead of calling the methods directly 
		new Service03Client().gui();
		//blockAccess(); 
		//incidentResponse(); 
		channel.shutdown();
	 }
	public static void blockAccess() {
		
		BlockAccessMessage request = BlockAccessMessage.newBuilder().setUserId("E32323").setSecureFlag(false).build(); 
		String user = "E32323 : "; 
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
	public void gui() { 

        // Create the two buttons
        button1 = new JButton("Block Access");
        button2 = new JButton("Incident Response");

        // Add action listeners to the buttons
        button1.addActionListener(this);
        button2.addActionListener(this);

        // Add the buttons to the content pane
        getContentPane().add(button1);
        getContentPane().add(button2);

        // Set the layout manager
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Set the size of the window
        setSize(300, 200);

        // Show the window
        setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == button1) {
	        blockAccess();
	    } else if (e.getSource() == button2) {
	        try {
	            incidentResponse();
	        } catch (InterruptedException ex) {
	            System.err.println("Error :  " + ex.getMessage());
	            ex.printStackTrace();
	        }
	    }
	}
}
		