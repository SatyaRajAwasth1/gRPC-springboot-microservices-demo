package org.example.userservice.gateway;

import com.example.socialmedia.comment.CommentRequest;
import com.example.socialmedia.comment.CommentResponse;
import com.example.socialmedia.comment.CommentServiceGrpc;
import com.example.socialmedia.post.PostRequest;
import com.example.socialmedia.post.PostResponse;
import com.example.socialmedia.post.PostServiceGrpc;
import com.example.socialmedia.user.AddUserRequest;
import com.example.socialmedia.user.AddUserResponse;
import com.example.socialmedia.user.UserRequest;
import com.example.socialmedia.user.UserResponse;
import com.example.socialmedia.user.UserServiceGrpc;
import io.grpc.StatusRuntimeException;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GrpcClient("postService")
    private PostServiceGrpc.PostServiceBlockingStub postServiceBlockingStub;

    @GrpcClient("commentService")
    private CommentServiceGrpc.CommentServiceBlockingStub commentServiceBlockingStub;

    @GrpcClient("userService")
    private UserServiceGrpc.UserServiceBlockingStub userServiceBlockingStub;

    @GetMapping("/posts/{postId}")
    public ResponseEntity<PostResponse> getPostDetails(@PathVariable String postId) {
        PostRequest request = PostRequest.newBuilder()
                .setPostId(postId)
                .build();
        try {
            PostResponse response = postServiceBlockingStub.getPostDetails(request);
            return ResponseEntity.ok(response);
        } catch (StatusRuntimeException e) {
            return handleGrpcException(e);
        }
    }

    @GetMapping("/comments/{commentId}")
    public ResponseEntity<CommentResponse> getCommentDetails(@PathVariable String commentId) {
        CommentRequest request = CommentRequest.newBuilder()
                .setCommentId(commentId)
                .build();
        try {
            CommentResponse response = commentServiceBlockingStub.getCommentDetails(request);
            return ResponseEntity.ok(response);
        } catch (StatusRuntimeException e) {
            return handleGrpcException(e);
        }
    }

    @GetMapping("/{userId}")
    public ResponseEntity<UserResponse> getUserDetails(@PathVariable String userId) {
        UserRequest request = UserRequest.newBuilder()
                .setUserId(userId)
                .build();
        try {
            UserResponse response = userServiceBlockingStub.getUserDetails(request);
            return ResponseEntity.ok(response);
        } catch (StatusRuntimeException e) {
            return handleGrpcException(e);
        }
    }

    @PostMapping("/")
    public ResponseEntity<AddUserResponse> addUser(@RequestBody AddUserRequest addUserRequest) {
        try {
            AddUserResponse response = userServiceBlockingStub.addUser(addUserRequest);
            return ResponseEntity.ok(response);
        } catch (StatusRuntimeException e) {
            return handleGrpcException(e);
        }
    }

    private ResponseEntity handleGrpcException(StatusRuntimeException e) {
        HttpStatus status = switch (e.getStatus().getCode()) {
            case NOT_FOUND -> HttpStatus.NOT_FOUND;
            case INVALID_ARGUMENT -> HttpStatus.BAD_REQUEST;
            default -> HttpStatus.INTERNAL_SERVER_ERROR;
        };
        return ResponseEntity.status(status).body(e.getStatus().getDescription());
    }
}
