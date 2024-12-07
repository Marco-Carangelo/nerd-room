package com.myprojects.mvc.nerdroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.mvc.nerdroom.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
