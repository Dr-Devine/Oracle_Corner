package com.example.oracle.repositories;

import com.example.oracle.models.Tarot;
import com.example.oracle.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
