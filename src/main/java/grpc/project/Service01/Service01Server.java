package grpc.project.Service01; 
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

import grpc.project.Service01.SecurityRequestServiceGrpc;
import grpc.project.Service01.RequestRFIDMsg; 
import grpc.project.Service01.ResponseAccess;

public class Service01Server {

    private Server server;

    private void start() throws IOException {
        int port = 8080;
        server = ServerBuilder.forPort(port)
                .addService(new SecurityRequestServiceImpl())
                .build()
                .start();
        System.out.println("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Shutting down gRPC server since JVM is shutting down");
            Service01Server.this.stop();
            System.out.println("Server shut down");
        }));
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        final Service01Server server = new Service01Server();
        server.start();
        server.blockUntilShutdown();
    }

    private static class SecurityRequestServiceImpl extends SecurityRequestServiceGrpc.SecurityRequestServiceImplBase {

        private String authorisationCode = "234DF501HF8373898900";

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
            ResponseAccess response = ResponseAccess.newBuilder()
                    .setAccessResponse(access)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}