package com.myprojects.mvc.nerdroom.controller;

import java.time.Year;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myprojects.mvc.nerdroom.model.Movie;
import com.myprojects.mvc.nerdroom.service.MovieService;

import jakarta.validation.Valid;

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
	
	@PostMapping("/create")
	public String store(
			@Valid @ModelAttribute("movie") Movie formMovie,
			BindingResult bindingResult,
			Model model,
			RedirectAttributes attributes,
			@RequestParam(name = "yearValue") int yearValue) {
		
		//Set the given year as value of the Year object
		Year formYear = Year.of(yearValue);
		formMovie.setYear(formYear);
		
		//Check if the object has errors
		if(bindingResult.hasErrors()) {
			return "/movies/create";
		}
		
		movieService.createMovie(formMovie);
		
		return "redirect:/movies";
	}
}
