package org.example.postservice;

import com.example.socialmedia.post.*;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.server.service.GrpcService;

@Slf4j
@GrpcService
public class PostServiceImpl extends PostServiceGrpc.PostServiceImplBase {

    @Override
    public void getPostDetails(PostRequest request, StreamObserver<PostResponse> responseObserver) {
        log.info("Getting post details for request: {}", request);
        PostResponse response = PostResponse.newBuilder()
                .setPostId(request.getPostId())
                .setUserId("1234")
                .setContent("Sample Content")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addPost(AddPostRequest request, StreamObserver<AddPostResponse> responseObserver) {
        // Implement the logic to add a new post
        AddPostResponse response = AddPostResponse.newBuilder()
                .setPostId("generatedPostId")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
