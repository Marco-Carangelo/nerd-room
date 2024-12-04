package com.myprojects.mvc.nerdroom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.mvc.nerdroom.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
	
	//JPA custom query methods
	public List<Movie> findByTitleContainsIgnoreCase(String text);

}
