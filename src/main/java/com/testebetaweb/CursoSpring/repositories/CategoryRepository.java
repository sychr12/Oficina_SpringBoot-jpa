package com.testebetaweb.CursoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testebetaweb.CursoSpring.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}


