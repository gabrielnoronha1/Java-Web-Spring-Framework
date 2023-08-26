package com.example.userDepartment.repositories;

import com.example.userDepartment.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
