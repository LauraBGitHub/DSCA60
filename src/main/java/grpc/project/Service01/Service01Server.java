package grpc.project.Service01; 

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

import grpc.project.Service01.SecurityRequestServiceGrpc.SecurityRequestServiceImplBase;


public class Service01Server extends SecurityRequestServiceImplBase {

	String userId; 
	String securityLevel; 
	boolean flag; 
	boolean twoFactor; 
	String employment; 
	String date; 
    public static void main (String args[])  throws IOException, InterruptedException {
    	
    	Service01Server server01 = new Service01Server(); 
        int port = 8080;
        Server server = ServerBuilder.forPort(port)
                .addService(server01)
                .build()
                .start();
        System.out.println("Server started, listening on " + port);
        server.awaitTermination();
    }
    
    
    private String authorisationCode = "234DF501HF8373898900";
    public void varClass(String var01, String var02, boolean var03, boolean var04, String var05, String var06) {
    	var01 = userId; 
    	var02 = securityLevel; 
    	var03 = flag; 
    	var04 = twoFactor; 
    	var05 = employment; 
    	var06 = date; 
    }
	@Override
	public void requestRFID(RequestRFIDMsg request, StreamObserver<ResponseAccess> responseObserver) {
		 String access;
         String rfidGiven = request.getCode();
         char[] rfidArray = rfidGiven.toCharArray();
         if (rfidGiven.length() != authorisationCode.length()){
             access = "false";
         }
         else {
             int count = 0;
             for(int i=0; i<rfidGiven.length()-1 ; i++) {
                 if (rfidArray[i] != authorisationCode.charAt(i)) {
                     count = count+1;
                 }
             }
             if (count == 0){
                 access = "True";
             }
             else {
                 access = "false";
             }
         }
         ResponseAccess response = ResponseAccess.newBuilder().setAccessResponse(access).build(); 
         responseObserver.onNext(response);
 		 responseObserver.onCompleted(); 
	}
	@Override
	public StreamObserver<RequestDoorAccessMsg> requestDoorAccess(StreamObserver<ResponseAccess> responseObserver) {
		// TODO Auto-generated method stub
		return super.requestDoorAccess(responseObserver);
	}
	@Override
	public void requestSecurityProfile(RequestSecProfile request, StreamObserver<SecurityProfile> responseObserver) {
		
	}
	
	
    
} 