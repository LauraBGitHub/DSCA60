package grpc.project.Service02;

import grpc.project.Service02.AccessControlGrpc.AccessControlImplBase;
import io.grpc.stub.StreamObserver;

import java.time.*;

public class Service02Server extends AccessControlImplBase{

	@Override
	public void setSecurityProfile(SetSecurityProfileRequest request,
			StreamObserver<SetSecurityProfileResponse> responseObserver) {
		System.out.println("Inside first method"); 
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
		// we can put the manipulation or logic here but user input is gotten from client 
		
		//here we create the object that stores the date and we convert it into a string 
		LocalDate myObj = LocalDate.now(); 
	    String date = myObj.toString(); 
		response.setUserId(userId).setSecurityLevel(securityLevel).setTwoFactorAuth(twoFactor).setDateSet(date); 
		//sends data (supposed to be server streaming) 
		responseObserver.onNext(response.build());
		responseObserver.onCompleted(); 
	}

	@Override
	public void verifyPreApproval(VerifyPreApprovalMsg request,
			StreamObserver<VerifyPreApprovalResponse> responseObserver) {
		
	}

	@Override
	public void requestTwoFA(RequestTwoFAMsg request, StreamObserver<RequestTwoFAResponse> responseObserver) {
		
	}
	
}