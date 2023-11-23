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

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("")
    public List<Admin> Admins() {
        return adminService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Admin> AdminById(@PathVariable Long id){
        return adminService.findById(id);
    }

    @PostMapping
    public Admin CreateAdmin(@RequestBody Admin admin){
        return adminService.create(admin);
    }

    @DeleteMapping("/{adminId}")
    public ResponseEntity<String> deleteAdmin(@PathVariable Long adminId) {
        adminService.deleteById(adminId);
        return ResponseEntity.ok("Admin deleted successfully");
    }
}
