package grpc.project.Service02;

import java.io.IOException;
import java.time.*;
import java.util.Iterator;
import java.util.logging.Logger;

import grpc.project.Service01.Service01Server;
import grpc.project.Service02.AccessControlGrpc.AccessControlImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;



@SuppressWarnings("unused")
public class Service02Server extends AccessControlImplBase{
	
	String userId; 
	String securityLevel; 
	boolean flag; 
	boolean twoFactor; 
	String employment; 
	String date; 
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
		
		userId = request.getUserId(); 
		securityLevel = request.getSecurityLevel(); 
		flag = request.getSecureFlag(); 
		
		employment = request.getEmploymentType(); 
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
	    date = myObj.toString(); 
	    Service01Server profile = new Service01Server(); 
	    profile.varClass(securityLevel, twoFactor, flag, employment, date);
		
		//sends data stream  
		responseObserver.onNext(response.setUserId(userId).build());
		responseObserver.onNext(response.setSecurityLevel(securityLevel).build());
		responseObserver.onNext(response.setTwoFactorAuth(twoFactor).build());
		responseObserver.onNext(response.setDateSet(date).build());
		responseObserver.onCompleted(); 
	}


	@Override
	public void verifyPreApproval(VerifyPreApprovalMsg request,StreamObserver<VerifyPreApprovalResponse> responseObserver) {
		System.out.println("Verifying pre approval ... "); 
		String userId = request.getUserId(); 
		String result = "  User Approved "; 
		
		VerifyPreApprovalResponse reply = VerifyPreApprovalResponse.newBuilder().setResult(result).build(); 
		responseObserver.onNext(reply);
		responseObserver.onCompleted(); 
		
	}

	@Override
	public void requestTwoFA(RequestTwoFAMsg request, StreamObserver<RequestTwoFAResponse> responseObserver) {
		System.out.println("Requesting TwoFactor Authentication ... "); 
		String userId = request.getUserId(); 
		String result = "   2FA Requested "; 
		RequestTwoFAResponse reply = RequestTwoFAResponse.newBuilder().setResult(result).build(); 
		responseObserver.onNext(reply);
		responseObserver.onCompleted(); 
	}
	
}