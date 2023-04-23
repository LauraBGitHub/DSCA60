package grpc.project.Service01;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Service01.proto")
public final class SecurityRequestServiceGrpc {

  private SecurityRequestServiceGrpc() {}

  public static final String SERVICE_NAME = "Service01.SecurityRequestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.project.Service01.RequestRFIDMsg,
      grpc.project.Service01.ResponseAccess> getRequestRFIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestRFID",
      requestType = grpc.project.Service01.RequestRFIDMsg.class,
      responseType = grpc.project.Service01.ResponseAccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.project.Service01.RequestRFIDMsg,
      grpc.project.Service01.ResponseAccess> getRequestRFIDMethod() {
    io.grpc.MethodDescriptor<grpc.project.Service01.RequestRFIDMsg, grpc.project.Service01.ResponseAccess> getRequestRFIDMethod;
    if ((getRequestRFIDMethod = SecurityRequestServiceGrpc.getRequestRFIDMethod) == null) {
      synchronized (SecurityRequestServiceGrpc.class) {
        if ((getRequestRFIDMethod = SecurityRequestServiceGrpc.getRequestRFIDMethod) == null) {
          SecurityRequestServiceGrpc.getRequestRFIDMethod = getRequestRFIDMethod = 
              io.grpc.MethodDescriptor.<grpc.project.Service01.RequestRFIDMsg, grpc.project.Service01.ResponseAccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service01.SecurityRequestService", "RequestRFID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service01.RequestRFIDMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service01.ResponseAccess.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityRequestServiceMethodDescriptorSupplier("RequestRFID"))
                  .build();
          }
        }
     }
     return getRequestRFIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.Service01.RequestDoorAccessMsg,
      grpc.project.Service01.ResponseAccess> getRequestDoorAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestDoorAccess",
      requestType = grpc.project.Service01.RequestDoorAccessMsg.class,
      responseType = grpc.project.Service01.ResponseAccess.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.project.Service01.RequestDoorAccessMsg,
      grpc.project.Service01.ResponseAccess> getRequestDoorAccessMethod() {
    io.grpc.MethodDescriptor<grpc.project.Service01.RequestDoorAccessMsg, grpc.project.Service01.ResponseAccess> getRequestDoorAccessMethod;
    if ((getRequestDoorAccessMethod = SecurityRequestServiceGrpc.getRequestDoorAccessMethod) == null) {
      synchronized (SecurityRequestServiceGrpc.class) {
        if ((getRequestDoorAccessMethod = SecurityRequestServiceGrpc.getRequestDoorAccessMethod) == null) {
          SecurityRequestServiceGrpc.getRequestDoorAccessMethod = getRequestDoorAccessMethod = 
              io.grpc.MethodDescriptor.<grpc.project.Service01.RequestDoorAccessMsg, grpc.project.Service01.ResponseAccess>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service01.SecurityRequestService", "RequestDoorAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service01.RequestDoorAccessMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service01.ResponseAccess.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityRequestServiceMethodDescriptorSupplier("RequestDoorAccess"))
                  .build();
          }
        }
     }
     return getRequestDoorAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.Service01.RequestSecProfile,
      grpc.project.Service01.SecurityProfile> getRequestSecurityProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestSecurityProfile",
      requestType = grpc.project.Service01.RequestSecProfile.class,
      responseType = grpc.project.Service01.SecurityProfile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.Service01.RequestSecProfile,
      grpc.project.Service01.SecurityProfile> getRequestSecurityProfileMethod() {
    io.grpc.MethodDescriptor<grpc.project.Service01.RequestSecProfile, grpc.project.Service01.SecurityProfile> getRequestSecurityProfileMethod;
    if ((getRequestSecurityProfileMethod = SecurityRequestServiceGrpc.getRequestSecurityProfileMethod) == null) {
      synchronized (SecurityRequestServiceGrpc.class) {
        if ((getRequestSecurityProfileMethod = SecurityRequestServiceGrpc.getRequestSecurityProfileMethod) == null) {
          SecurityRequestServiceGrpc.getRequestSecurityProfileMethod = getRequestSecurityProfileMethod = 
              io.grpc.MethodDescriptor.<grpc.project.Service01.RequestSecProfile, grpc.project.Service01.SecurityProfile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service01.SecurityRequestService", "RequestSecurityProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service01.RequestSecProfile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service01.SecurityProfile.getDefaultInstance()))
                  .setSchemaDescriptor(new SecurityRequestServiceMethodDescriptorSupplier("RequestSecurityProfile"))
                  .build();
          }
        }
     }
     return getRequestSecurityProfileMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SecurityRequestServiceStub newStub(io.grpc.Channel channel) {
    return new SecurityRequestServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SecurityRequestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SecurityRequestServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SecurityRequestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SecurityRequestServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SecurityRequestServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Method 1: RFID Request with Unary Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.project.Service01.RequestRFIDMsg> requestRFID(
        io.grpc.stub.StreamObserver<grpc.project.Service01.ResponseAccess> responseObserver) {
      return asyncUnimplementedStreamingCall(getRequestRFIDMethod(), responseObserver);
    }

    /**
     * <pre>
     * Method 2: PIN Request with Client-side Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.project.Service01.RequestDoorAccessMsg> requestDoorAccess(
        io.grpc.stub.StreamObserver<grpc.project.Service01.ResponseAccess> responseObserver) {
      return asyncUnimplementedStreamingCall(getRequestDoorAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Method 3: Request Security Profile with Unary Streaming
     * </pre>
     */
    public void requestSecurityProfile(grpc.project.Service01.RequestSecProfile request,
        io.grpc.stub.StreamObserver<grpc.project.Service01.SecurityProfile> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestSecurityProfileMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestRFIDMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.project.Service01.RequestRFIDMsg,
                grpc.project.Service01.ResponseAccess>(
                  this, METHODID_REQUEST_RFID)))
          .addMethod(
            getRequestDoorAccessMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.project.Service01.RequestDoorAccessMsg,
                grpc.project.Service01.ResponseAccess>(
                  this, METHODID_REQUEST_DOOR_ACCESS)))
          .addMethod(
            getRequestSecurityProfileMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.Service01.RequestSecProfile,
                grpc.project.Service01.SecurityProfile>(
                  this, METHODID_REQUEST_SECURITY_PROFILE)))
          .build();
    }
  }

  /**
   */
  public static final class SecurityRequestServiceStub extends io.grpc.stub.AbstractStub<SecurityRequestServiceStub> {
    private SecurityRequestServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityRequestServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityRequestServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityRequestServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method 1: RFID Request with Unary Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.project.Service01.RequestRFIDMsg> requestRFID(
        io.grpc.stub.StreamObserver<grpc.project.Service01.ResponseAccess> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRequestRFIDMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Method 2: PIN Request with Client-side Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.project.Service01.RequestDoorAccessMsg> requestDoorAccess(
        io.grpc.stub.StreamObserver<grpc.project.Service01.ResponseAccess> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRequestDoorAccessMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Method 3: Request Security Profile with Unary Streaming
     * </pre>
     */
    public void requestSecurityProfile(grpc.project.Service01.RequestSecProfile request,
        io.grpc.stub.StreamObserver<grpc.project.Service01.SecurityProfile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestSecurityProfileMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SecurityRequestServiceBlockingStub extends io.grpc.stub.AbstractStub<SecurityRequestServiceBlockingStub> {
    private SecurityRequestServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityRequestServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityRequestServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityRequestServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method 3: Request Security Profile with Unary Streaming
     * </pre>
     */
    public grpc.project.Service01.SecurityProfile requestSecurityProfile(grpc.project.Service01.RequestSecProfile request) {
      return blockingUnaryCall(
          getChannel(), getRequestSecurityProfileMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SecurityRequestServiceFutureStub extends io.grpc.stub.AbstractStub<SecurityRequestServiceFutureStub> {
    private SecurityRequestServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SecurityRequestServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SecurityRequestServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SecurityRequestServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Method 3: Request Security Profile with Unary Streaming
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.Service01.SecurityProfile> requestSecurityProfile(
        grpc.project.Service01.RequestSecProfile request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestSecurityProfileMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST_SECURITY_PROFILE = 0;
  private static final int METHODID_REQUEST_RFID = 1;
  private static final int METHODID_REQUEST_DOOR_ACCESS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SecurityRequestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SecurityRequestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_SECURITY_PROFILE:
          serviceImpl.requestSecurityProfile((grpc.project.Service01.RequestSecProfile) request,
              (io.grpc.stub.StreamObserver<grpc.project.Service01.SecurityProfile>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST_RFID:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.requestRFID(
              (io.grpc.stub.StreamObserver<grpc.project.Service01.ResponseAccess>) responseObserver);
        case METHODID_REQUEST_DOOR_ACCESS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.requestDoorAccess(
              (io.grpc.stub.StreamObserver<grpc.project.Service01.ResponseAccess>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SecurityRequestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SecurityRequestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.project.Service01.Service01Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SecurityRequestService");
    }
  }

  private static final class SecurityRequestServiceFileDescriptorSupplier
      extends SecurityRequestServiceBaseDescriptorSupplier {
    SecurityRequestServiceFileDescriptorSupplier() {}
  }

  private static final class SecurityRequestServiceMethodDescriptorSupplier
      extends SecurityRequestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SecurityRequestServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SecurityRequestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SecurityRequestServiceFileDescriptorSupplier())
              .addMethod(getRequestRFIDMethod())
              .addMethod(getRequestDoorAccessMethod())
              .addMethod(getRequestSecurityProfileMethod())
              .build();
        }
      }
    }
    return result;
  }
}
