package grpc.project.Service02;

import java.io.IOException;
import java.time.*;
import java.util.Iterator;
import java.util.logging.Logger;

import grpc.project.Service02.AccessControlGrpc.AccessControlImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;



public class Service02Server extends AccessControlImplBase{
	
	private static final Logger logger = Logger.getLogger(Service02Server.class.getName());
	
	public static void main(String[] args  )throws IOException, InterruptedException { 
		
		Service02Server server02 = new Service02Server(); 
		int port  = 9090; 
		Server server = ServerBuilder.forPort(port).addService(server02).build().start(); 
		logger.info("Server started, listening on " + port);
		server.awaitTermination();
	}

	@Override
	public void setSecurityProfile(SetSecurityProfileRequest request,StreamObserver<SetSecurityProfileResponse> responseObserver) {
		
		String userId = request.getUserId(); 
		String securityLevel = request.getSecurityLevel(); 
		boolean flag = request.getSecureFlag(); 
		boolean twoFactor; 
		String employment = request.getEmploymentType(); 
		// put buisness logic here ^^ get user input 
		if (flag == true) { 
			twoFactor = true; 
		}
		else {
			twoFactor = false; 
			} 
		// now we can do the reply first line is an object called response that hold the return msg 
		SetSecurityProfileResponse.Builder response = SetSecurityProfileResponse.newBuilder(); 
	
		//here we create the object that stores the date and we convert it into a string 
		LocalDate myObj = LocalDate.now(); 
	    String date = myObj.toString(); 
		
		//sends data stream  
		responseObserver.onNext(response.setUserId(userId).build());
		responseObserver.onNext(response.setSecurityLevel(securityLevel).build());
		responseObserver.onNext(response.setTwoFactorAuth(twoFactor).build());
		responseObserver.onNext(response.setDateSet(date).build());
		responseObserver.onCompleted(); 
	}

	@Override
	public void verifyPreApproval(VerifyPreApprovalMsg request,
			StreamObserver<VerifyPreApprovalResponse> responseObserver) {
		String userId = request.getUserId(); 
		 
		 
		
	}

	@Override
	public void requestTwoFA(RequestTwoFAMsg request, StreamObserver<RequestTwoFAResponse> responseObserver) {
		
	}
	
}