package org.avyudaya.curtain.mapper;

import lombok.AllArgsConstructor;
import org.avyudaya.curtain.dto.UserView;
import org.avyudaya.curtain.exception.NotFoundException;
import org.avyudaya.curtain.model.User;
import org.avyudaya.curtain.repository.UserRepository;
import org.avyudaya.curtain.utils.StringUtils;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class UserViewMapper {
    private final UserRepository userRepo;
    public static UserView toUserView(User user){
        var userView = new UserView();
        userView.setId(StringUtils.getNotNullString(user.getId()));
        userView.setEmail(StringUtils.getNotNullString(user.getEmail()));
        userView.setFullName(StringUtils.getNotNullString(user.getFullName()));
        return userView;
    }

    public UserView toUserViewById(String id){
        if(id==null){
            return null;
        }
        return toUserView(userRepo.findById(id).orElseThrow(() -> new NotFoundException("User not found.")));
    }
}
