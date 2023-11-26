package com.example.quizzgamepeuf.DAO;

import com.example.quizzgamepeuf.models.Admin;
import com.example.quizzgamepeuf.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {

    Admin save(Admin admin);

    void deleteById(Long id);
    @Query("SELECT a FROM Admin a WHERE a.id = :id")
    Optional<Admin> findById(Long id);

    @Query("SELECT a FROM Admin a WHERE a.email = :mail")
    Optional<Admin> findByMail(String mail);

}
