package grpc.project.Service03;

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
    comments = "Source: Service03.proto")
public final class IncidentResponseGrpc {

  private IncidentResponseGrpc() {}

  public static final String SERVICE_NAME = "Service03.IncidentResponse";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.project.Service03.BlockAccessMessage,
      grpc.project.Service03.BlockAccessResponseMessage> getBlockAccessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BlockAccess",
      requestType = grpc.project.Service03.BlockAccessMessage.class,
      responseType = grpc.project.Service03.BlockAccessResponseMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.project.Service03.BlockAccessMessage,
      grpc.project.Service03.BlockAccessResponseMessage> getBlockAccessMethod() {
    io.grpc.MethodDescriptor<grpc.project.Service03.BlockAccessMessage, grpc.project.Service03.BlockAccessResponseMessage> getBlockAccessMethod;
    if ((getBlockAccessMethod = IncidentResponseGrpc.getBlockAccessMethod) == null) {
      synchronized (IncidentResponseGrpc.class) {
        if ((getBlockAccessMethod = IncidentResponseGrpc.getBlockAccessMethod) == null) {
          IncidentResponseGrpc.getBlockAccessMethod = getBlockAccessMethod = 
              io.grpc.MethodDescriptor.<grpc.project.Service03.BlockAccessMessage, grpc.project.Service03.BlockAccessResponseMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "Service03.IncidentResponse", "BlockAccess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service03.BlockAccessMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service03.BlockAccessResponseMessage.getDefaultInstance()))
                  .setSchemaDescriptor(new IncidentResponseMethodDescriptorSupplier("BlockAccess"))
                  .build();
          }
        }
     }
     return getBlockAccessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.project.Service03.SuggestIncidentRequest,
      grpc.project.Service03.SuggestIncidentResponseMsg> getSuggestIncidentResponseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuggestIncidentResponse",
      requestType = grpc.project.Service03.SuggestIncidentRequest.class,
      responseType = grpc.project.Service03.SuggestIncidentResponseMsg.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.project.Service03.SuggestIncidentRequest,
      grpc.project.Service03.SuggestIncidentResponseMsg> getSuggestIncidentResponseMethod() {
    io.grpc.MethodDescriptor<grpc.project.Service03.SuggestIncidentRequest, grpc.project.Service03.SuggestIncidentResponseMsg> getSuggestIncidentResponseMethod;
    if ((getSuggestIncidentResponseMethod = IncidentResponseGrpc.getSuggestIncidentResponseMethod) == null) {
      synchronized (IncidentResponseGrpc.class) {
        if ((getSuggestIncidentResponseMethod = IncidentResponseGrpc.getSuggestIncidentResponseMethod) == null) {
          IncidentResponseGrpc.getSuggestIncidentResponseMethod = getSuggestIncidentResponseMethod = 
              io.grpc.MethodDescriptor.<grpc.project.Service03.SuggestIncidentRequest, grpc.project.Service03.SuggestIncidentResponseMsg>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "Service03.IncidentResponse", "SuggestIncidentResponse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service03.SuggestIncidentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.project.Service03.SuggestIncidentResponseMsg.getDefaultInstance()))
                  .setSchemaDescriptor(new IncidentResponseMethodDescriptorSupplier("SuggestIncidentResponse"))
                  .build();
          }
        }
     }
     return getSuggestIncidentResponseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IncidentResponseStub newStub(io.grpc.Channel channel) {
    return new IncidentResponseStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IncidentResponseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new IncidentResponseBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IncidentResponseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new IncidentResponseFutureStub(channel);
  }

  /**
   */
  public static abstract class IncidentResponseImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Block Access (unary)
     * </pre>
     */
    public void blockAccess(grpc.project.Service03.BlockAccessMessage request,
        io.grpc.stub.StreamObserver<grpc.project.Service03.BlockAccessResponseMessage> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockAccessMethod(), responseObserver);
    }

    /**
     * <pre>
     * Suggest Incident Response (bidirectional streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.project.Service03.SuggestIncidentRequest> suggestIncidentResponse(
        io.grpc.stub.StreamObserver<grpc.project.Service03.SuggestIncidentResponseMsg> responseObserver) {
      return asyncUnimplementedStreamingCall(getSuggestIncidentResponseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBlockAccessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.project.Service03.BlockAccessMessage,
                grpc.project.Service03.BlockAccessResponseMessage>(
                  this, METHODID_BLOCK_ACCESS)))
          .addMethod(
            getSuggestIncidentResponseMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.project.Service03.SuggestIncidentRequest,
                grpc.project.Service03.SuggestIncidentResponseMsg>(
                  this, METHODID_SUGGEST_INCIDENT_RESPONSE)))
          .build();
    }
  }

  /**
   */
  public static final class IncidentResponseStub extends io.grpc.stub.AbstractStub<IncidentResponseStub> {
    private IncidentResponseStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentResponseStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentResponseStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncidentResponseStub(channel, callOptions);
    }

    /**
     * <pre>
     * Block Access (unary)
     * </pre>
     */
    public void blockAccess(grpc.project.Service03.BlockAccessMessage request,
        io.grpc.stub.StreamObserver<grpc.project.Service03.BlockAccessResponseMessage> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockAccessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Suggest Incident Response (bidirectional streaming)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.project.Service03.SuggestIncidentRequest> suggestIncidentResponse(
        io.grpc.stub.StreamObserver<grpc.project.Service03.SuggestIncidentResponseMsg> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSuggestIncidentResponseMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class IncidentResponseBlockingStub extends io.grpc.stub.AbstractStub<IncidentResponseBlockingStub> {
    private IncidentResponseBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentResponseBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentResponseBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncidentResponseBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Block Access (unary)
     * </pre>
     */
    public grpc.project.Service03.BlockAccessResponseMessage blockAccess(grpc.project.Service03.BlockAccessMessage request) {
      return blockingUnaryCall(
          getChannel(), getBlockAccessMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class IncidentResponseFutureStub extends io.grpc.stub.AbstractStub<IncidentResponseFutureStub> {
    private IncidentResponseFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private IncidentResponseFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IncidentResponseFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new IncidentResponseFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Block Access (unary)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.project.Service03.BlockAccessResponseMessage> blockAccess(
        grpc.project.Service03.BlockAccessMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockAccessMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BLOCK_ACCESS = 0;
  private static final int METHODID_SUGGEST_INCIDENT_RESPONSE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IncidentResponseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IncidentResponseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BLOCK_ACCESS:
          serviceImpl.blockAccess((grpc.project.Service03.BlockAccessMessage) request,
              (io.grpc.stub.StreamObserver<grpc.project.Service03.BlockAccessResponseMessage>) responseObserver);
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
        case METHODID_SUGGEST_INCIDENT_RESPONSE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.suggestIncidentResponse(
              (io.grpc.stub.StreamObserver<grpc.project.Service03.SuggestIncidentResponseMsg>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class IncidentResponseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IncidentResponseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.project.Service03.Service03Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IncidentResponse");
    }
  }

  private static final class IncidentResponseFileDescriptorSupplier
      extends IncidentResponseBaseDescriptorSupplier {
    IncidentResponseFileDescriptorSupplier() {}
  }

  private static final class IncidentResponseMethodDescriptorSupplier
      extends IncidentResponseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IncidentResponseMethodDescriptorSupplier(String methodName) {
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
      synchronized (IncidentResponseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IncidentResponseFileDescriptorSupplier())
              .addMethod(getBlockAccessMethod())
              .addMethod(getSuggestIncidentResponseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
