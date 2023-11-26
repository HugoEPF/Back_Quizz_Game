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

    // Injection de dépendances via le constructeur
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Récupère tous les utilisateurs
    @GetMapping("")
    public List<User> Users() {
        return userService.findAll();
    }

    // Récupère un utilisateur par ID
    @GetMapping("/{id}")
    public Optional<User> UserById(@PathVariable Long id){
        return userService.findById(id);
    }

    // Récupère un utilisateur par adresse e-mail
    @GetMapping("/email/{email}")
    public Optional<User> UserByMail(@PathVariable String email){
        return userService.findByMail(email);
    }

    // Crée un nouvel utilisateur
    @PostMapping
    public User CreateUser(@RequestBody User user){
        return userService.create(user);
    }

    // Supprime un utilisateur par ID
    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable Long userId) {
        userService.deleteById(userId);
        return ResponseEntity.ok("User deleted successfully");
    }

}
