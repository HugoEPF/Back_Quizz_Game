package com.example.quizzgamepeuf.controllers;

import com.example.quizzgamepeuf.models.Admin;
import com.example.quizzgamepeuf.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RequestMapping("admins")
@RestController
@RequiredArgsConstructor
public class AdminController {

    private AdminService adminService;

    // Injection de dépendances via le constructeur
    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    // Récupère tous les administrateurs
    @GetMapping("")
    public List<Admin> Admins() {
        return adminService.findAll();
    }

    // Récupère un administrateur par ID
    @GetMapping("/{id}")
    public Optional<Admin> AdminById(@PathVariable Long id){
        return adminService.findById(id);
    }
    // Récupère un administrateur par adresse e-mail
    @GetMapping("/email/{email}")
    public Optional<Admin> AdminByMail(@PathVariable String email){
        return adminService.findByMail(email);
    }

    // Crée un nouvel administrateur
    @PostMapping
    public Admin CreateAdmin(@RequestBody Admin admin){
        return adminService.create(admin);
    }

    // Supprime un administrateur par ID
    @DeleteMapping("/{adminId}")
    public ResponseEntity<String> deleteAdmin(@PathVariable Long adminId) {
        adminService.deleteById(adminId);
        return ResponseEntity.ok("Admin deleted successfully");
    }
}
