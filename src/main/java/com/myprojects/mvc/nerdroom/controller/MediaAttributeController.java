package com.myprojects.mvc.nerdroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myprojects.mvc.nerdroom.model.MediaAttribute;
import com.myprojects.mvc.nerdroom.service.MediaAttributeService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/media-attributes")
public class MediaAttributeController {

	//Service Classes
	@Autowired
	private MediaAttributeService mediaAttributeService;
	
	//CRUD methods
	
	//Create method
	@PostMapping("/media-attributes")
	public String store(
			@Valid @ModelAttribute("mediaAttribute") MediaAttribute formMediaAttribute,
			BindingResult bindingResult,
			Model model,
			RedirectAttributes attributes
			) {
		
		//Check if the object has errors
		if(bindingResult.hasErrors()) {
			return "/media-attributes";
		}
		
		mediaAttributeService.createMediaAttribute(formMediaAttribute);
		
		return "redirect:/media-attributes";
	}
	
	//Update method
	@PostMapping("/media-attributes/{id}")
	public String update(
			@Valid @ModelAttribute("mediaAttribute") MediaAttribute formMediaAttribute,
			BindingResult bindingResult,
			Model model,
			RedirectAttributes attributes
			) {
		
		//Check if the object has errors
		if(bindingResult.hasErrors()) {
			return "/media-attributes";
		}
		
		mediaAttributeService.createMediaAttribute(formMediaAttribute);
		
		return "redirect:/media-attributes";
	}
	
	//Delete method
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable("id") Integer id) {
		
		mediaAttributeService.deleteMediaAttribute(id);
		return "redirect:/media-attributes";
	}
}
