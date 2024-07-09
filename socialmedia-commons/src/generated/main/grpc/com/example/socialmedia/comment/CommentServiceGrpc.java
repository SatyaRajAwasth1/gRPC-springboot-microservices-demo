package com.example.socialmedia.comment;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: comment/comment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CommentServiceGrpc {

  private CommentServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.example.proto.comment.CommentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.socialmedia.comment.CommentRequest,
      com.example.socialmedia.comment.CommentResponse> getGetCommentDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCommentDetails",
      requestType = com.example.socialmedia.comment.CommentRequest.class,
      responseType = com.example.socialmedia.comment.CommentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.socialmedia.comment.CommentRequest,
      com.example.socialmedia.comment.CommentResponse> getGetCommentDetailsMethod() {
    io.grpc.MethodDescriptor<com.example.socialmedia.comment.CommentRequest, com.example.socialmedia.comment.CommentResponse> getGetCommentDetailsMethod;
    if ((getGetCommentDetailsMethod = CommentServiceGrpc.getGetCommentDetailsMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getGetCommentDetailsMethod = CommentServiceGrpc.getGetCommentDetailsMethod) == null) {
          CommentServiceGrpc.getGetCommentDetailsMethod = getGetCommentDetailsMethod =
              io.grpc.MethodDescriptor.<com.example.socialmedia.comment.CommentRequest, com.example.socialmedia.comment.CommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCommentDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.socialmedia.comment.CommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.socialmedia.comment.CommentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("GetCommentDetails"))
              .build();
        }
      }
    }
    return getGetCommentDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.socialmedia.comment.AddCommentRequest,
      com.example.socialmedia.comment.AddCommentResponse> getAddCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddComment",
      requestType = com.example.socialmedia.comment.AddCommentRequest.class,
      responseType = com.example.socialmedia.comment.AddCommentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.socialmedia.comment.AddCommentRequest,
      com.example.socialmedia.comment.AddCommentResponse> getAddCommentMethod() {
    io.grpc.MethodDescriptor<com.example.socialmedia.comment.AddCommentRequest, com.example.socialmedia.comment.AddCommentResponse> getAddCommentMethod;
    if ((getAddCommentMethod = CommentServiceGrpc.getAddCommentMethod) == null) {
      synchronized (CommentServiceGrpc.class) {
        if ((getAddCommentMethod = CommentServiceGrpc.getAddCommentMethod) == null) {
          CommentServiceGrpc.getAddCommentMethod = getAddCommentMethod =
              io.grpc.MethodDescriptor.<com.example.socialmedia.comment.AddCommentRequest, com.example.socialmedia.comment.AddCommentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.socialmedia.comment.AddCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.socialmedia.comment.AddCommentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CommentServiceMethodDescriptorSupplier("AddComment"))
              .build();
        }
      }
    }
    return getAddCommentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CommentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceStub>() {
        @java.lang.Override
        public CommentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceStub(channel, callOptions);
        }
      };
    return CommentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CommentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceBlockingStub>() {
        @java.lang.Override
        public CommentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceBlockingStub(channel, callOptions);
        }
      };
    return CommentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CommentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CommentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CommentServiceFutureStub>() {
        @java.lang.Override
        public CommentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CommentServiceFutureStub(channel, callOptions);
        }
      };
    return CommentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getCommentDetails(com.example.socialmedia.comment.CommentRequest request,
        io.grpc.stub.StreamObserver<com.example.socialmedia.comment.CommentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCommentDetailsMethod(), responseObserver);
    }

    /**
     */
    default void addComment(com.example.socialmedia.comment.AddCommentRequest request,
        io.grpc.stub.StreamObserver<com.example.socialmedia.comment.AddCommentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCommentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CommentService.
   */
  public static abstract class CommentServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CommentServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CommentService.
   */
  public static final class CommentServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CommentServiceStub> {
    private CommentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCommentDetails(com.example.socialmedia.comment.CommentRequest request,
        io.grpc.stub.StreamObserver<com.example.socialmedia.comment.CommentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCommentDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addComment(com.example.socialmedia.comment.AddCommentRequest request,
        io.grpc.stub.StreamObserver<com.example.socialmedia.comment.AddCommentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCommentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CommentService.
   */
  public static final class CommentServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CommentServiceBlockingStub> {
    private CommentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.socialmedia.comment.CommentResponse getCommentDetails(com.example.socialmedia.comment.CommentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCommentDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.socialmedia.comment.AddCommentResponse addComment(com.example.socialmedia.comment.AddCommentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCommentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CommentService.
   */
  public static final class CommentServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CommentServiceFutureStub> {
    private CommentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CommentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CommentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.socialmedia.comment.CommentResponse> getCommentDetails(
        com.example.socialmedia.comment.CommentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCommentDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.socialmedia.comment.AddCommentResponse> addComment(
        com.example.socialmedia.comment.AddCommentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCommentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_COMMENT_DETAILS = 0;
  private static final int METHODID_ADD_COMMENT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COMMENT_DETAILS:
          serviceImpl.getCommentDetails((com.example.socialmedia.comment.CommentRequest) request,
              (io.grpc.stub.StreamObserver<com.example.socialmedia.comment.CommentResponse>) responseObserver);
          break;
        case METHODID_ADD_COMMENT:
          serviceImpl.addComment((com.example.socialmedia.comment.AddCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.example.socialmedia.comment.AddCommentResponse>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetCommentDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.socialmedia.comment.CommentRequest,
              com.example.socialmedia.comment.CommentResponse>(
                service, METHODID_GET_COMMENT_DETAILS)))
        .addMethod(
          getAddCommentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.socialmedia.comment.AddCommentRequest,
              com.example.socialmedia.comment.AddCommentResponse>(
                service, METHODID_ADD_COMMENT)))
        .build();
  }

  private static abstract class CommentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CommentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.socialmedia.comment.CommentProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CommentService");
    }
  }

  private static final class CommentServiceFileDescriptorSupplier
      extends CommentServiceBaseDescriptorSupplier {
    CommentServiceFileDescriptorSupplier() {}
  }

  private static final class CommentServiceMethodDescriptorSupplier
      extends CommentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CommentServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CommentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CommentServiceFileDescriptorSupplier())
              .addMethod(getGetCommentDetailsMethod())
              .addMethod(getAddCommentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
