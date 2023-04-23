package grpc.project.Service01; 
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver; 

import javax.swing.*;
import grpc.project.Service01.SecurityRequestServiceGrpc;
import grpc.project.Service01.RequestRFIDMsg; 
import grpc.project.Service01.ResponseAccess; 


public class GUI {
    public static void main(String[] args) throws InterruptedException {
        String hostname = "localhost";
        if (args.length > 0) {
            hostname = args[0];
        }
    
        ManagedChannel channel = ManagedChannelBuilder.forAddress(hostname, 8080)
                .usePlaintext()
                .build();
    
        SecurityRequestServiceGrpc.SecurityRequestServiceStub stub = SecurityRequestServiceGrpc.newStub(channel);
    
        /*main code  */
        JFrame f;
        f = new JFrame();
        String RFID = JOptionPane.showInputDialog(f, "Enter RFID CODE");
    
        RequestRFIDMsg request = RequestRFIDMsg.newBuilder()
                .setCode(RFID)
                .build();
    
        StreamObserver<RequestRFIDMsg> requestObserver = stub.requestRFID(new StreamObserver<ResponseAccess>() {
            @Override
            public void onNext(ResponseAccess responseAccess) {
                System.out.println("Access: " + responseAccess.getAccessResponse());
            }
    
            @Override
            public void onError(Throwable throwable) {
                System.out.println("Error occurred: " + throwable.getMessage());
            }
    
            @Override
            public void onCompleted() {
                System.out.println("Server has completed the request!");
            }
        });
    
        requestObserver.onNext(request);
    
        Thread.sleep(5000);
    
        channel.shutdown();
    }

} 
