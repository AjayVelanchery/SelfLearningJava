package com.example.demo.service;


import com.example.demo.dto.UserLocationDTO;
import com.example.demo.model.User;
import com.example.demo.repostiory.UserRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepostiory userRepostiory;
    public List<UserLocationDTO> getAllUsersLocation(){
     return userRepostiory.findAll()
             .stream()
             .map(this::converEntityToDto)
             .collect(Collectors.toList());
    }

    private UserLocationDTO converEntityToDto(User user)

    {
        UserLocationDTO userLocationDTO= new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setEmail(user.getEmail());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLongitude(user.getLocation().getLongitude());
        userLocationDTO.setLatitude(user.getLocation().getLatitude());
        return userLocationDTO;

    }
}
