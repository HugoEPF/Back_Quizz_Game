package com.example.quizzgamepeuf.DAO;

import com.example.quizzgamepeuf.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
    User save(User user);

    void deleteById(Long id);

    @Query("SELECT u FROM User u WHERE u.id = :id")
    Optional<User> findById(Long id);


}
