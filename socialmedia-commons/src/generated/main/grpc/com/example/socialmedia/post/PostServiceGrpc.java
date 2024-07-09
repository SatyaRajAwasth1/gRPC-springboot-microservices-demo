package com.example.socialmedia.post;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: post/post.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class PostServiceGrpc {

  private PostServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.example.proto.post.PostService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.socialmedia.post.PostRequest,
      com.example.socialmedia.post.PostResponse> getGetPostDetailsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPostDetails",
      requestType = com.example.socialmedia.post.PostRequest.class,
      responseType = com.example.socialmedia.post.PostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.socialmedia.post.PostRequest,
      com.example.socialmedia.post.PostResponse> getGetPostDetailsMethod() {
    io.grpc.MethodDescriptor<com.example.socialmedia.post.PostRequest, com.example.socialmedia.post.PostResponse> getGetPostDetailsMethod;
    if ((getGetPostDetailsMethod = PostServiceGrpc.getGetPostDetailsMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getGetPostDetailsMethod = PostServiceGrpc.getGetPostDetailsMethod) == null) {
          PostServiceGrpc.getGetPostDetailsMethod = getGetPostDetailsMethod =
              io.grpc.MethodDescriptor.<com.example.socialmedia.post.PostRequest, com.example.socialmedia.post.PostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPostDetails"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.socialmedia.post.PostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.socialmedia.post.PostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("GetPostDetails"))
              .build();
        }
      }
    }
    return getGetPostDetailsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.socialmedia.post.AddPostRequest,
      com.example.socialmedia.post.AddPostResponse> getAddPostMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddPost",
      requestType = com.example.socialmedia.post.AddPostRequest.class,
      responseType = com.example.socialmedia.post.AddPostResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.socialmedia.post.AddPostRequest,
      com.example.socialmedia.post.AddPostResponse> getAddPostMethod() {
    io.grpc.MethodDescriptor<com.example.socialmedia.post.AddPostRequest, com.example.socialmedia.post.AddPostResponse> getAddPostMethod;
    if ((getAddPostMethod = PostServiceGrpc.getAddPostMethod) == null) {
      synchronized (PostServiceGrpc.class) {
        if ((getAddPostMethod = PostServiceGrpc.getAddPostMethod) == null) {
          PostServiceGrpc.getAddPostMethod = getAddPostMethod =
              io.grpc.MethodDescriptor.<com.example.socialmedia.post.AddPostRequest, com.example.socialmedia.post.AddPostResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddPost"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.socialmedia.post.AddPostRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.socialmedia.post.AddPostResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PostServiceMethodDescriptorSupplier("AddPost"))
              .build();
        }
      }
    }
    return getAddPostMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PostServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostServiceStub>() {
        @java.lang.Override
        public PostServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostServiceStub(channel, callOptions);
        }
      };
    return PostServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PostServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostServiceBlockingStub>() {
        @java.lang.Override
        public PostServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostServiceBlockingStub(channel, callOptions);
        }
      };
    return PostServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PostServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PostServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PostServiceFutureStub>() {
        @java.lang.Override
        public PostServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PostServiceFutureStub(channel, callOptions);
        }
      };
    return PostServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getPostDetails(com.example.socialmedia.post.PostRequest request,
        io.grpc.stub.StreamObserver<com.example.socialmedia.post.PostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPostDetailsMethod(), responseObserver);
    }

    /**
     */
    default void addPost(com.example.socialmedia.post.AddPostRequest request,
        io.grpc.stub.StreamObserver<com.example.socialmedia.post.AddPostResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddPostMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service PostService.
   */
  public static abstract class PostServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return PostServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service PostService.
   */
  public static final class PostServiceStub
      extends io.grpc.stub.AbstractAsyncStub<PostServiceStub> {
    private PostServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostServiceStub(channel, callOptions);
    }

    /**
     */
    public void getPostDetails(com.example.socialmedia.post.PostRequest request,
        io.grpc.stub.StreamObserver<com.example.socialmedia.post.PostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPostDetailsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addPost(com.example.socialmedia.post.AddPostRequest request,
        io.grpc.stub.StreamObserver<com.example.socialmedia.post.AddPostResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddPostMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service PostService.
   */
  public static final class PostServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<PostServiceBlockingStub> {
    private PostServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.socialmedia.post.PostResponse getPostDetails(com.example.socialmedia.post.PostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPostDetailsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.socialmedia.post.AddPostResponse addPost(com.example.socialmedia.post.AddPostRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddPostMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service PostService.
   */
  public static final class PostServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<PostServiceFutureStub> {
    private PostServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PostServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PostServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.socialmedia.post.PostResponse> getPostDetails(
        com.example.socialmedia.post.PostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPostDetailsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.socialmedia.post.AddPostResponse> addPost(
        com.example.socialmedia.post.AddPostRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddPostMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_POST_DETAILS = 0;
  private static final int METHODID_ADD_POST = 1;

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
        case METHODID_GET_POST_DETAILS:
          serviceImpl.getPostDetails((com.example.socialmedia.post.PostRequest) request,
              (io.grpc.stub.StreamObserver<com.example.socialmedia.post.PostResponse>) responseObserver);
          break;
        case METHODID_ADD_POST:
          serviceImpl.addPost((com.example.socialmedia.post.AddPostRequest) request,
              (io.grpc.stub.StreamObserver<com.example.socialmedia.post.AddPostResponse>) responseObserver);
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
          getGetPostDetailsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.socialmedia.post.PostRequest,
              com.example.socialmedia.post.PostResponse>(
                service, METHODID_GET_POST_DETAILS)))
        .addMethod(
          getAddPostMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.socialmedia.post.AddPostRequest,
              com.example.socialmedia.post.AddPostResponse>(
                service, METHODID_ADD_POST)))
        .build();
  }

  private static abstract class PostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PostServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.socialmedia.post.PostProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PostService");
    }
  }

  private static final class PostServiceFileDescriptorSupplier
      extends PostServiceBaseDescriptorSupplier {
    PostServiceFileDescriptorSupplier() {}
  }

  private static final class PostServiceMethodDescriptorSupplier
      extends PostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    PostServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (PostServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PostServiceFileDescriptorSupplier())
              .addMethod(getGetPostDetailsMethod())
              .addMethod(getAddPostMethod())
              .build();
        }
      }
    }
    return result;
  }
}
