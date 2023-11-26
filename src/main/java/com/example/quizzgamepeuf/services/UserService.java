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
    public User create(User user) {
        return userDao.save(user);
    }

    public void deleteById(Long id){
        userDao.deleteById(id);
    }
    public Optional<User> findById(Long id){
        return  userDao.findById(id);
    }
    public List<User> findAll() {
        Iterable<User> it = userDao.findAll();
        List<User> users = new ArrayList<>();
        it.forEach(users::add);
        return users;
    }
    public Optional<User> findByMail(String mail){
        return userDao.findByMail(mail);
    }

}
