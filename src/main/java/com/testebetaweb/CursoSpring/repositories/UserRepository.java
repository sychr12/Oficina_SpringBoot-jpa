package com.testebetaweb.CursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testebetaweb.CursoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}


