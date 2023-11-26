package com.example.quizzgamepeuf.services;

import com.example.quizzgamepeuf.DAO.AdminDao;
import com.example.quizzgamepeuf.models.Admin;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AdminDao adminDao;

    //On appelle la méthode save du Dao pour créer un admin
    public Admin create(Admin admin) {
        return adminDao.save(admin);
    }

    //On appelle la méthode delete du Dao pour supprimer un admin
    public void deleteById(Long id){
        adminDao.deleteById(id);
    }

    //On appelle la méthode findById du Dao pour trouver un admin par id
    public Optional<Admin> findById(Long id){
        return  adminDao.findById(id);
    }

    //On appelle la méthode findByMail du Dao pour trouver un admin par mail
    public Optional<Admin> findByMail(String mail){
        return adminDao.findByMail(mail);
    }

    //On appelle la méthode findAll du Dao pour trouver tous les admins
    public List<Admin> findAll() {
        Iterable<Admin> it = adminDao.findAll();
        List<Admin> admins = new ArrayList<>();
        it.forEach(admins::add);
        return admins;
    }
}
