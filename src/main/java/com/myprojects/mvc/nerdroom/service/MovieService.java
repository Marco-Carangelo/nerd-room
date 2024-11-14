package com.myprojects.mvc.nerdroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojects.mvc.nerdroom.model.Movie;
import com.myprojects.mvc.nerdroom.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository repo;
	
	public List<Movie> findMovies(){
		return repo.findAll();
	}

}
