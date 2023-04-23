package grpc.project.Service02;


import io.grpc.Server; 
import io.grpc.ServerBuilder;

import java.io.IOException;

import grpc.project.Service02.Service02Server;


public class Service02 { 
	
	public static void main(String[]args) throws InterruptedException, IOException { 
	
			//create an instance of the server 
			Server server = ServerBuilder.
					forPort(9090).addService(new Service02Server()).build(); 
			server.start(); 
			System.out.println("Server started, listening on " + server.getPort());
			server.awaitTermination(); 
	}
}