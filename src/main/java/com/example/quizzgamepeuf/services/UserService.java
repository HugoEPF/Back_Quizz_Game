package com.example.quizzgamepeuf.services;

import com.example.quizzgamepeuf.DAO.UserDao;
import com.example.quizzgamepeuf.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserDao userDao;

    //On appelle le dao pour créer un user
    public User create(User user) {
        return userDao.save(user);
    }

    //On appelle le dao pour supprimer un user
    public void deleteById(Long id){
        userDao.deleteById(id);
    }

    //On appelle le dao pour trouver un user par son id
    public Optional<User> findById(Long id){
        return  userDao.findById(id);
    }

    //On appelle le dao pour trouver tous les users
    public List<User> findAll() {
        Iterable<User> it = userDao.findAll();
        List<User> users = new ArrayList<>();
        it.forEach(users::add);
        return users;
    }

    //On appelle le dao pour trouver un user par mail
    public Optional<User> findByMail(String mail){
        return userDao.findByMail(mail);
    }

}
