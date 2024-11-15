package com.myprojects.mvc.nerdroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myprojects.mvc.nerdroom.model.Movie;
import com.myprojects.mvc.nerdroom.service.MovieService;

@Controller
@RequestMapping("/movies")
public class MovieController {
	
	//Service classes
	@Autowired
	private MovieService movieService;
	
	//Index Method
	@GetMapping
	public String index(Model model ) {
		
		model.addAttribute("movieList", movieService.findMovies());
		return "/movies/index";
		
	}
	
	//Show Method
	@GetMapping("/{id}")
	public String show(Model model, @PathVariable("id") Integer id ) {
		
		model.addAttribute("movie", movieService.findMovieById(id));
		return "/movies/show";
	}
	
	//Create Method
	@GetMapping("/create")
	public String create(Model model){
		
		//Add to model a black movie object
		Movie movie = new Movie();
		model.addAttribute("movie", movie);
		
		return "/movies/create";
	}
	

}
