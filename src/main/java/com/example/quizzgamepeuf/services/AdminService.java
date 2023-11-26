package com.example.quizzgamepeuf.services;

import com.example.quizzgamepeuf.DAO.AdminDao;
import com.example.quizzgamepeuf.models.Admin;
import com.example.quizzgamepeuf.models.Quizz;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminDao adminDao;

    public Admin create(Admin admin) {
        return adminDao.save(admin);
    }

    public void deleteById(Long id){
        adminDao.deleteById(id);
    }
    public Optional<Admin> findById(Long id){
        return  adminDao.findById(id);
    }
    public List<Admin> findAll() {
        Iterable<Admin> it = adminDao.findAll();
        List<Admin> admins = new ArrayList<>();
        it.forEach(admins::add);
        return admins;
    }
}
