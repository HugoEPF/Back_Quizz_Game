package com.example.quizzgamepeuf.controllers;

import com.example.quizzgamepeuf.models.User;
import com.example.quizzgamepeuf.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("users")
@RestController
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("")
    public List<User> Users() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> UserById(@PathVariable Long id){
        return userService.findById(id);
    }

    @GetMapping("/email/{email}")
    public Optional<User> UserByMail(@PathVariable String email){
        return userService.findByMail(email);
    }

    @PostMapping
    public User CreateUser(@RequestBody User user){
        return userService.create(user);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        userService.deleteById(userId);
        return ResponseEntity.ok("User deleted successfully");
    }

}
