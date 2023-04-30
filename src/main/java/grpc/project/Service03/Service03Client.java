package grpc.project.Service03;

import io.grpc.ManagedChannel; 
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import grpc.project.Service03.IncidentResponseGrpc;
import grpc.project.Service03.IncidentResponseGrpc.IncidentResponseBlockingStub;

public class Service03Client { 
	private static IncidentResponseGrpc.IncidentResponseBlockingStub blockingStub;
	public static void main (String[] args) { 
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9091)
		.usePlaintext()
		.build(); 
		//create the stubs
		blockingStub = IncidentResponseGrpc.newBlockingStub(channel);
		blockAccess(); 
		channel.shutdown();
	 }
	public static void blockAccess() {
		
		BlockAccessMessage request = BlockAccessMessage.newBuilder().setUserId("E32323").setSecureFlag(false).build(); 
		String user = "E32323 : "; 
		BlockAccessResponseMessage response = blockingStub.blockAccess(request); 
		System.out.println(user + response.getResult());
	}
}
		