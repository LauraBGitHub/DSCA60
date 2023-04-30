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
	public StreamObserver<SuggestIncidentRequest> suggestIncidentResponse(
			StreamObserver<SuggestIncidentResponseMsg> responseObserver) {
		// TODO Auto-generated method stub
		return super.suggestIncidentResponse(responseObserver);
	}
	
}