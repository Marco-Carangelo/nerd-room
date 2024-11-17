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
	public Movie findMovieById(Integer id){
		return repo.findById(id).get();
	}

	public Movie createMovie(Movie movie) {
		return repo.save(movie);
	}
}
