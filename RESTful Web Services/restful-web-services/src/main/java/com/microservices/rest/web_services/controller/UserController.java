package com.microservices.rest.web_services.controller;

import com.microservices.rest.web_services.dao.UserDao;
import com.microservices.rest.web_services.modal.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class UserController {

    private UserDao users;

    public UserController(UserDao users){
        this.users = users;
    }

    @GetMapping("/users")
    public List<User> retriveAllUsers(){
        return users.findAll();
    }

    @GetMapping("/users/{id}")
    public User retriveUser(@PathVariable int id){
        return users.findOne(id);
    }

    @PostMapping("/users")
    public void createUser(@RequestBody User user){
     users.save(user);
    }


}
