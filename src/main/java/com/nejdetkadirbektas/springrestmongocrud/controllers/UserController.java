package com.nejdetkadirbektas.springrestmongocrud.controllers;

import com.nejdetkadirbektas.springrestmongocrud.domain.User;
import com.nejdetkadirbektas.springrestmongocrud.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author nejdetkadirr
 */
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userRepository.save(user));
    }

    @GetMapping
    public ResponseEntity<List<User>> ListOfUsers() {
        return ResponseEntity.ok(userRepository.findAll());
    }
}
