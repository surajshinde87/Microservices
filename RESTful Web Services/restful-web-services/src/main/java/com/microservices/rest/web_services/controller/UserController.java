package com.microservices.rest.web_services.controller;

import com.microservices.rest.web_services.dao.UserDao;
import com.microservices.rest.web_services.exceptions.UserNotFoundException;
import com.microservices.rest.web_services.modal.User;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
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
        User  user = users.findOne(id);

        if (user == null){
            throw new UserNotFoundException("id:" + id);
        }

        return  user;
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user){
     User savedUser = users.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
     return  ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable int id){
         users.deleteById(id);
    }

}
