package com.myprojects.mvc.nerdroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myprojects.mvc.nerdroom.model.Rating;
import com.myprojects.mvc.nerdroom.service.RatingService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/ratings")
public class RatingController {
	
	//Service classes
	private RatingService ratingService;
	
	//CRUD methods
	//*****************************************************************************************
	//TUTTI I RETURN DI QUESTO CONTROLLER SARANNO DA RIELABORARE QUANDO CI SARANNO ALTRI MEDIA
	//*****************************************************************************************
	
	//Create method
	@PostMapping("/create")
	public String store(
			@Valid @ModelAttribute("rating") Rating formRating,
			BindingResult bindingResult,
			Model model,
			RedirectAttributes attributes
			) {
		
		//Check if the formRating object has not errors and save the Rating before to return to the media page
		if(!bindingResult.hasErrors()) {	
			ratingService.createRating(formRating);
		}
		return "movies/" + formRating.getMedia().getId();
	}
	
	//Update method
	@PostMapping("/edit/{id}")
	public String update(
			@Valid @ModelAttribute("rating") Rating formRating,
			BindingResult bindingResult,
			Model model,
			RedirectAttributes attributes
			) {
		
		//Check if the formRating object has not errors and update the Rating before to return to the media page
		if(!bindingResult.hasErrors()) {	
			ratingService.createRating(formRating);
		}
		return "movies/" + formRating.getMedia().getId();
	}
	
	
	//Delete method
	@PostMapping("/delete/{id}")
	public String delete( @PathVariable("id") Integer id,
			RedirectAttributes attributes) {
			
			ratingService.deleteRating(id);
			
		return "/movies/" + id;
		
	}

}
