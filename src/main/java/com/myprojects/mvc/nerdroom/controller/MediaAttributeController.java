package com.myprojects.mvc.nerdroom.controller;

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

import com.myprojects.mvc.nerdroom.model.MediaAttribute;
import com.myprojects.mvc.nerdroom.service.CategoryService;
import com.myprojects.mvc.nerdroom.service.MediaAttributeService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/media-attributes")
public class MediaAttributeController {

	//Service Classes
	@Autowired
	private MediaAttributeService mediaAttributeService;
	
	@Autowired
	private CategoryService categoryService;
	
	//CRUD methods
	
	//Index method
	@GetMapping
	public String index(Model model, @RequestParam( name = "searchAttribute", required = false) String searchAttribute) {
		
		//Add to model the list of all attributes
		if (searchAttribute != null && !searchAttribute.isEmpty()) {
			model.addAttribute("mediaAttributesList", mediaAttributeService.findMediaAttributesByName(searchAttribute));
		}else {
			model.addAttribute("mediaAttributesList", mediaAttributeService.findMediaAttributes());
		}
		
		//Add to model a blank attribute object for new attribute creation
		MediaAttribute newAttribute = new MediaAttribute();
		model.addAttribute("newAttribute",newAttribute);
		//Add to the model the attribute categories list
		model.addAttribute("categories", categoryService.findCategories());
	
		return "/media-attributes/index";
	}
	
	//Create method
	@PostMapping("/create")
	public String store(
			@Valid @ModelAttribute("mediaAttribute") MediaAttribute formMediaAttribute,
			BindingResult bindingResult,
			Model model,
			RedirectAttributes attributes
			) {
		
		//Check if the object has errors
		if(bindingResult.hasErrors()) {
			return "redirect:/media-attributes";
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
