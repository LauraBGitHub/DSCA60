package grpc.project.Service02;

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
    comments = "Source: Service02.proto")
public final class AccessControlGrpc {

  private AccessControlGrpc() {}

  public static final String SERVICE_NAME = "Service02.AccessControl";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.project.Service02.SetSecurityProfileRequest,
      grpc.project.Service02.SetSecurityProfileResponse> getSetSecurityProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSecurityProfile",
      requestType = grpc.project.Service02.SetSecurityProfileRequest.class,
      responseType = grpc.project.Service02.SetSecurityProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.project.Service02.SetSecurityProfileRequest,
      grpc.project.Service02.SetSecurityProfileResponse> getSetSecurityProfileMethod() {
    io.grpc.MethodDescriptor<grpc.project.Service02.SetSecurityProfileRequest, grpc.project.Service02.SetSecurityProfileResponse> getSetSecurityProfileMethod;
    if ((getSetSecurityProfileMethod = AccessControlGrpc.getSetSecurityProfileMethod) == null) {
      synchronized (AccessControlGrpc.class) {
        if ((getSetSecurityProfileMethod = AccessControlGrpc.getSetSecurityProfileMethod) == null) {
          AccessControlGrpc.getSetSecurityProfileMethod = getSetSecurityProfileMethod = 
              io.grpc.MethodDescriptor.<grpc.project.Service02.SetSecurityProfileRequest, grpc.project.Service02.SetSecurityProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service02.AccessControl", "SetSecurityProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service02.SetSecurityProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service02.SetSecurityProfileResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessControlMethodDescriptorSupplier("SetSecurityProfile"))
                  .build();
          }
        }
     }
     return getSetSecurityProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.Service02.VerifyPreApprovalMsg,
      grpc.project.Service02.VerifyPreApprovalResponse> getVerifyPreApprovalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyPreApproval",
      requestType = grpc.project.Service02.VerifyPreApprovalMsg.class,
      responseType = grpc.project.Service02.VerifyPreApprovalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.Service02.VerifyPreApprovalMsg,
      grpc.project.Service02.VerifyPreApprovalResponse> getVerifyPreApprovalMethod() {
    io.grpc.MethodDescriptor<grpc.project.Service02.VerifyPreApprovalMsg, grpc.project.Service02.VerifyPreApprovalResponse> getVerifyPreApprovalMethod;
    if ((getVerifyPreApprovalMethod = AccessControlGrpc.getVerifyPreApprovalMethod) == null) {
      synchronized (AccessControlGrpc.class) {
        if ((getVerifyPreApprovalMethod = AccessControlGrpc.getVerifyPreApprovalMethod) == null) {
          AccessControlGrpc.getVerifyPreApprovalMethod = getVerifyPreApprovalMethod = 
              io.grpc.MethodDescriptor.<grpc.project.Service02.VerifyPreApprovalMsg, grpc.project.Service02.VerifyPreApprovalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service02.AccessControl", "VerifyPreApproval"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service02.VerifyPreApprovalMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service02.VerifyPreApprovalResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessControlMethodDescriptorSupplier("VerifyPreApproval"))
                  .build();
          }
        }
     }
     return getVerifyPreApprovalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.Service02.RequestTwoFAMsg,
      grpc.project.Service02.RequestTwoFAResponse> getRequestTwoFAMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RequestTwoFA",
      requestType = grpc.project.Service02.RequestTwoFAMsg.class,
      responseType = grpc.project.Service02.RequestTwoFAResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.Service02.RequestTwoFAMsg,
      grpc.project.Service02.RequestTwoFAResponse> getRequestTwoFAMethod() {
    io.grpc.MethodDescriptor<grpc.project.Service02.RequestTwoFAMsg, grpc.project.Service02.RequestTwoFAResponse> getRequestTwoFAMethod;
    if ((getRequestTwoFAMethod = AccessControlGrpc.getRequestTwoFAMethod) == null) {
      synchronized (AccessControlGrpc.class) {
        if ((getRequestTwoFAMethod = AccessControlGrpc.getRequestTwoFAMethod) == null) {
          AccessControlGrpc.getRequestTwoFAMethod = getRequestTwoFAMethod = 
              io.grpc.MethodDescriptor.<grpc.project.Service02.RequestTwoFAMsg, grpc.project.Service02.RequestTwoFAResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service02.AccessControl", "RequestTwoFA"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service02.RequestTwoFAMsg.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service02.RequestTwoFAResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new AccessControlMethodDescriptorSupplier("RequestTwoFA"))
                  .build();
          }
        }
     }
     return getRequestTwoFAMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccessControlStub newStub(io.grpc.Channel channel) {
    return new AccessControlStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccessControlBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccessControlBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccessControlFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccessControlFutureStub(channel);
  }

  /**
   */
  public static abstract class AccessControlImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * SET Security Profile (server streaming)
     * </pre>
     */
    public void setSecurityProfile(grpc.project.Service02.SetSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<grpc.project.Service02.SetSecurityProfileResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSetSecurityProfileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Verify PreApproval (unary)
     * </pre>
     */
    public void verifyPreApproval(grpc.project.Service02.VerifyPreApprovalMsg request,
        io.grpc.stub.StreamObserver<grpc.project.Service02.VerifyPreApprovalResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyPreApprovalMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request 2FA (unary)
     * </pre>
     */
    public void requestTwoFA(grpc.project.Service02.RequestTwoFAMsg request,
        io.grpc.stub.StreamObserver<grpc.project.Service02.RequestTwoFAResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRequestTwoFAMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetSecurityProfileMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.project.Service02.SetSecurityProfileRequest,
                grpc.project.Service02.SetSecurityProfileResponse>(
                  this, METHODID_SET_SECURITY_PROFILE)))
          .addMethod(
            getVerifyPreApprovalMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.Service02.VerifyPreApprovalMsg,
                grpc.project.Service02.VerifyPreApprovalResponse>(
                  this, METHODID_VERIFY_PRE_APPROVAL)))
          .addMethod(
            getRequestTwoFAMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.Service02.RequestTwoFAMsg,
                grpc.project.Service02.RequestTwoFAResponse>(
                  this, METHODID_REQUEST_TWO_FA)))
          .build();
    }
  }

  /**
   */
  public static final class AccessControlStub extends io.grpc.stub.AbstractStub<AccessControlStub> {
    private AccessControlStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessControlStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessControlStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessControlStub(channel, callOptions);
    }

    /**
     * <pre>
     * SET Security Profile (server streaming)
     * </pre>
     */
    public void setSecurityProfile(grpc.project.Service02.SetSecurityProfileRequest request,
        io.grpc.stub.StreamObserver<grpc.project.Service02.SetSecurityProfileResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSetSecurityProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Verify PreApproval (unary)
     * </pre>
     */
    public void verifyPreApproval(grpc.project.Service02.VerifyPreApprovalMsg request,
        io.grpc.stub.StreamObserver<grpc.project.Service02.VerifyPreApprovalResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyPreApprovalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request 2FA (unary)
     * </pre>
     */
    public void requestTwoFA(grpc.project.Service02.RequestTwoFAMsg request,
        io.grpc.stub.StreamObserver<grpc.project.Service02.RequestTwoFAResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRequestTwoFAMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccessControlBlockingStub extends io.grpc.stub.AbstractStub<AccessControlBlockingStub> {
    private AccessControlBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessControlBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessControlBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessControlBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * SET Security Profile (server streaming)
     * </pre>
     */
    public java.util.Iterator<grpc.project.Service02.SetSecurityProfileResponse> setSecurityProfile(
        grpc.project.Service02.SetSecurityProfileRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSetSecurityProfileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Verify PreApproval (unary)
     * </pre>
     */
    public grpc.project.Service02.VerifyPreApprovalResponse verifyPreApproval(grpc.project.Service02.VerifyPreApprovalMsg request) {
      return blockingUnaryCall(
          getChannel(), getVerifyPreApprovalMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request 2FA (unary)
     * </pre>
     */
    public grpc.project.Service02.RequestTwoFAResponse requestTwoFA(grpc.project.Service02.RequestTwoFAMsg request) {
      return blockingUnaryCall(
          getChannel(), getRequestTwoFAMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccessControlFutureStub extends io.grpc.stub.AbstractStub<AccessControlFutureStub> {
    private AccessControlFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccessControlFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccessControlFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccessControlFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Verify PreApproval (unary)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.Service02.VerifyPreApprovalResponse> verifyPreApproval(
        grpc.project.Service02.VerifyPreApprovalMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyPreApprovalMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request 2FA (unary)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.Service02.RequestTwoFAResponse> requestTwoFA(
        grpc.project.Service02.RequestTwoFAMsg request) {
      return futureUnaryCall(
          getChannel().newCall(getRequestTwoFAMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_SECURITY_PROFILE = 0;
  private static final int METHODID_VERIFY_PRE_APPROVAL = 1;
  private static final int METHODID_REQUEST_TWO_FA = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccessControlImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccessControlImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_SECURITY_PROFILE:
          serviceImpl.setSecurityProfile((grpc.project.Service02.SetSecurityProfileRequest) request,
              (io.grpc.stub.StreamObserver<grpc.project.Service02.SetSecurityProfileResponse>) responseObserver);
          break;
        case METHODID_VERIFY_PRE_APPROVAL:
          serviceImpl.verifyPreApproval((grpc.project.Service02.VerifyPreApprovalMsg) request,
              (io.grpc.stub.StreamObserver<grpc.project.Service02.VerifyPreApprovalResponse>) responseObserver);
          break;
        case METHODID_REQUEST_TWO_FA:
          serviceImpl.requestTwoFA((grpc.project.Service02.RequestTwoFAMsg) request,
              (io.grpc.stub.StreamObserver<grpc.project.Service02.RequestTwoFAResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AccessControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccessControlBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.project.Service02.Service02Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccessControl");
    }
  }

  private static final class AccessControlFileDescriptorSupplier
      extends AccessControlBaseDescriptorSupplier {
    AccessControlFileDescriptorSupplier() {}
  }

  private static final class AccessControlMethodDescriptorSupplier
      extends AccessControlBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccessControlMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccessControlGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccessControlFileDescriptorSupplier())
              .addMethod(getSetSecurityProfileMethod())
              .addMethod(getVerifyPreApprovalMethod())
              .addMethod(getRequestTwoFAMethod())
              .build();
        }
      }
    }
    return result;
  }
}
