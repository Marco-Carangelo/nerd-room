package com.myprojects.mvc.nerdroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.mvc.nerdroom.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {

}
