package org.avyudaya.curtain.service;

import jakarta.validation.ValidationException;
import lombok.RequiredArgsConstructor;
import org.avyudaya.curtain.dto.CreateUserReq;
import org.avyudaya.curtain.dto.UserView;
import org.avyudaya.curtain.mapper.UserMapper;
import org.avyudaya.curtain.mapper.UserViewMapper;
import org.avyudaya.curtain.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public UserView create(CreateUserReq request) {
        if (userRepository.findByEmail(request.getEmail()).isPresent()) {
            throw new ValidationException("Email exists!");
        }
        if (!request.getPassword().equals(request.getRePassword())) {
            throw new ValidationException("Passwords don't match!");
        }

        var user = UserMapper.create(request);
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        user = userRepository.save(user);

        return UserViewMapper.toUserView(user);
    }
}
