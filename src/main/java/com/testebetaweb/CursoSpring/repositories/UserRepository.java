package com.testebetaweb.CursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testebetaweb.CursoSpring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}


