package grpc.project.Service03;
import java.io.IOException;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import grpc.project.Service03.IncidentResponseGrpc.IncidentResponseImplBase;

public class Service03Server extends IncidentResponseImplBase{  
	
	private static final Logger logger = Logger.getLogger(Service03Server.class.getName());
	
	public static void main(String[] args) throws IOException, InterruptedException {
		Service03Server server03 = new Service03Server(); 
		int port  = 9091; 
		Server server = ServerBuilder.forPort(port).addService(server03).build().start(); 
		logger.info("Server started, listening on " + port); 
		server.awaitTermination();
	}

	@Override
	public void blockAccess(BlockAccessMessage request, StreamObserver<BlockAccessResponseMessage> responseObserver) {
		String userID = request.getUserId(); 
		boolean flag = request.getSecureFlag(); 
		String result; 
		
		if (flag == false) { 
			result = "User access not blocked "; 
		}
		else { 
			result = "User access blocked "; 
		}
		BlockAccessResponseMessage response = BlockAccessResponseMessage.newBuilder().setResult(result).build(); 
		responseObserver.onNext(response);
		responseObserver.onCompleted(); 
	}

	@Override
	public StreamObserver<SuggestIncidentRequest> suggestIncidentResponse(StreamObserver<SuggestIncidentResponseMsg> responseObserver) {
		return new StreamObserver<SuggestIncidentRequest>() {

			@Override
			public void onNext(SuggestIncidentRequest value) {
				StringBuilder input1 = new StringBuilder();  
				input1.append(value.getAccessFailConditionTrips());
				String advice = "If user is blocked do manual inspection of account, Verify employment type and security level "; 
				input1.append(advice); 
				String key = "REF56"; 
			
				SuggestIncidentResponseMsg reply = SuggestIncidentResponseMsg.newBuilder()
						.setResponse(input1.toString()).setKeyId(key).build();
				responseObserver.onNext(reply);
				
			}

			@Override
			public void onError(Throwable t) {
				System.err.println("Error processing request: " + t.getMessage());
			    t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				responseObserver.onCompleted();
				
			}
			
		};
	}
	
}