package com.myprojects.mvc.nerdroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.mvc.nerdroom.model.Rating;

public interface RatingRepository extends JpaRepository<Rating,Integer>{

}
