package com.jwt.demo.JWT.controller;

import com.jwt.demo.JWT.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class HomeController {


    @GetMapping("/user")
    public String getUser(){
        System.out.println("Getting latest users");
        return "USERRRRR";
    }

    @PostMapping("/save")
    public ResponseEntity<?> saveUser(@RequestBody User user){

        return null ;
    }



}
