package com.shotly.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.shotly.api.dto.UserDTO;
import com.shotly.api.model.User;
import com.shotly.api.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void create(UserDTO data) {
        repository.save(new User(data));
    }

}
