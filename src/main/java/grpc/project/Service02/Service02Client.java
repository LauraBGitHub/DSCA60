import grpc.project.Service02.AccessControlGrpc;
import io.grpc.ManagedChannel; 
import io.grpc.ManagedChannelBuilder;


public class Service02Client { 
	public static void main (String[] args) { 
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
		.usePlaintext()
		.build(); 
		AccessControlGrpc.newBlockingStub(null)
	}
}