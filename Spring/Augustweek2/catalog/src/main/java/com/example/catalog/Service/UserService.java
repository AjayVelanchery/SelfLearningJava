package com.example.catalog.Service;


import com.example.catalog.Entities.User;
import com.example.catalog.dto.user.UserDTO;
import com.example.catalog.dto.user.UserRegisterRequest;
import com.example.catalog.exception.BadRequestException;
import com.example.catalog.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

private final UserRepository users;


@Transactional
public UserDTO register(UserRegisterRequest req){
    if(users.existsByEmailIgnoreCase(req.email()))
        throw new BadRequestException("Email already registered"+req.email());

    User u= User.builder()
            .username(req.username())
            .email(req.email())
            .password(req.password())
            .build();
u=users.save(u);
return new UserDTO(u.getId(),u.getUsername(),u.getEmail());
}
    public User getEntity(Long id) {
        return users.findById(id).orElseThrow(() -> new BadRequestException("User not found: " + id));
    }
}

