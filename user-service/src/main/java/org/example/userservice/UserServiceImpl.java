package org.example.userservice;

import com.example.socialmedia.user.UserRequest;
import com.example.socialmedia.user.UserResponse;
import com.example.socialmedia.user.AddUserRequest;
import com.example.socialmedia.user.AddUserResponse;
import com.example.socialmedia.user.UserServiceGrpc;

import io.grpc.stub.StreamObserver;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void getUserDetails(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        // Example implementation
        UserResponse response = UserResponse.newBuilder()
                .setUserId(request.getUserId())
                .setUsername("testUser")
                .setEmail("test@example.com")
                .setFullName("Test User")
                .setProfilePictureUrl("http://example.com/profile.jpg")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void addUser(AddUserRequest request, StreamObserver<AddUserResponse> responseObserver) {
        // Example implementation
        AddUserResponse response = AddUserResponse.newBuilder()
                .setUserId("newUserId")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
