package com.myprojects.mvc.nerdroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojects.mvc.nerdroom.model.Movie;
import com.myprojects.mvc.nerdroom.repository.MovieRepository;

@Service
public class MovieService {
	
	//Injection of the repository interface
	@Autowired
	private MovieRepository repo;
	
	//CRUD methods
	public List<Movie> findMovies(){
		return repo.findAll();
	}
	public Movie findMovieById(Integer id){
		return repo.findById(id).get();
	}

	public Movie createMovie(Movie movie) {
		return repo.save(movie);
	}
	
	public Movie updateMovie(Movie movie) {
		return repo.save(movie);
	}
	
	public void deleteMovie(Integer id) {
		repo.deleteById(id);
	}
	
	//Method to find movie by substring
	public List<Movie> findMovieByTitle(String text){
		return repo.findByTitleContainsIgnoreCase(text);
	}
}
