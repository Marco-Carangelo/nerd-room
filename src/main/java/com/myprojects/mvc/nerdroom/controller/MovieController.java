package com.myprojects.mvc.nerdroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myprojects.mvc.nerdroom.service.MovieService;

@Controller
@RequestMapping("/movies")
public class MovieController {
	
	//Service classes
	@Autowired
	private MovieService movieService;
	
	@GetMapping
	public String index(Model model ) {
		
		model.addAttribute("movieList", movieService.findMovies());
		return "/movies/index";
		
	}
	

}
