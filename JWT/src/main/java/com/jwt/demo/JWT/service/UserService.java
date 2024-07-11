package com.jwt.demo.JWT.service;


import com.jwt.demo.JWT.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {


    private List<User> users = new ArrayList<>();

    public UserService(){
        users.add(new User(UUID.randomUUID().toString(), "User 1 ", "user1@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "User 2 ", "user2@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "User 3 ", "user3@gmail.com"));
        users.add(new User(UUID.randomUUID().toString(), "User 4 ", "user4@gmail.com"));
    }

    public List<User> getUsers(){
        return this.users;
    }

}
