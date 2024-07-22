package org.example.commentservice;

import com.example.socialmedia.comment.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.time.LocalDateTime;

@GrpcService
public class CommentServiceImpl extends CommentServiceGrpc.CommentServiceImplBase {

    @Override
    public void getCommentDetails(CommentRequest request, StreamObserver<CommentResponse> responseObserver) {
        // Implement the logic to get comment details
        CommentResponse response = CommentResponse.newBuilder()
                .setCommentId(request.getCommentId())
                .setPostId("postId")
                .setUserId("userId")
                .setContent("content")
                .setTimestamp(LocalDateTime.now().toString())
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addComment(AddCommentRequest request, StreamObserver<AddCommentResponse> responseObserver) {
        // Implement the logic to add a new comment
        AddCommentResponse response = AddCommentResponse.newBuilder()
                .setCommentId("generatedCommentId")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
