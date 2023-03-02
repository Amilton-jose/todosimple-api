package com.amilton.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amilton.todosimple.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
