package org.avyudaya.curtain.mapper;

import org.avyudaya.curtain.dto.CreateUserReq;
import org.avyudaya.curtain.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public static User create(CreateUserReq createUserReq){
        var user = new User();
        user.setEmail(createUserReq.getEmail());
        user.setFullName(createUserReq.getFullName());
        user.setPassword(createUserReq.getPassword());
        return user;
    }
}
