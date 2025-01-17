// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: post/post.proto

package com.example.socialmedia.post;

public final class PostProto {
  private PostProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_proto_post_PostRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_proto_post_PostRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_proto_post_PostResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_proto_post_PostResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_proto_post_AddPostRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_proto_post_AddPostRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_proto_post_AddPostResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_proto_post_AddPostResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_example_proto_post_CommentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_example_proto_post_CommentResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017post/post.proto\022\026org.example.proto.pos" +
      "t\"\035\n\013PostRequest\022\016\n\006postId\030\001 \001(\t\"z\n\014Post" +
      "Response\022\016\n\006postId\030\001 \001(\t\022\016\n\006userId\030\002 \001(\t" +
      "\022\017\n\007content\030\003 \001(\t\0229\n\010comments\030\004 \003(\0132\'.or" +
      "g.example.proto.post.CommentResponse\"1\n\016" +
      "AddPostRequest\022\016\n\006userId\030\001 \001(\t\022\017\n\007conten" +
      "t\030\002 \001(\t\"!\n\017AddPostResponse\022\016\n\006postId\030\001 \001" +
      "(\t\"X\n\017CommentResponse\022\021\n\tcommentId\030\001 \001(\t" +
      "\022\016\n\006userId\030\002 \001(\t\022\017\n\007content\030\003 \001(\t\022\021\n\ttim" +
      "estamp\030\004 \001(\t2\306\001\n\013PostService\022[\n\016GetPostD" +
      "etails\022#.org.example.proto.post.PostRequ" +
      "est\032$.org.example.proto.post.PostRespons" +
      "e\022Z\n\007AddPost\022&.org.example.proto.post.Ad" +
      "dPostRequest\032\'.org.example.proto.post.Ad" +
      "dPostResponseB+\n\034com.example.socialmedia" +
      ".postB\tPostProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_org_example_proto_post_PostRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_example_proto_post_PostRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_proto_post_PostRequest_descriptor,
        new java.lang.String[] { "PostId", });
    internal_static_org_example_proto_post_PostResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_example_proto_post_PostResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_proto_post_PostResponse_descriptor,
        new java.lang.String[] { "PostId", "UserId", "Content", "Comments", });
    internal_static_org_example_proto_post_AddPostRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_example_proto_post_AddPostRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_proto_post_AddPostRequest_descriptor,
        new java.lang.String[] { "UserId", "Content", });
    internal_static_org_example_proto_post_AddPostResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_example_proto_post_AddPostResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_proto_post_AddPostResponse_descriptor,
        new java.lang.String[] { "PostId", });
    internal_static_org_example_proto_post_CommentResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_example_proto_post_CommentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_example_proto_post_CommentResponse_descriptor,
        new java.lang.String[] { "CommentId", "UserId", "Content", "Timestamp", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
