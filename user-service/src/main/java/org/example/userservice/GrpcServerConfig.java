/*
package org.example.userservice;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.protobuf.services.ProtoReflectionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcServerConfig {

    @Bean
    public Server grpcServer(UserServiceImpl userServiceImpl) {
        return ServerBuilder.forPort(9090)
                .addService(userServiceImpl)
                .addService(ProtoReflectionService.newInstance())
                .build();
    }
}
*/
