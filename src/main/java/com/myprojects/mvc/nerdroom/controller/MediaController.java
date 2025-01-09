package com.myprojects.mvc.nerdroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myprojects.mvc.nerdroom.service.MediaService;

@Controller
@RequestMapping("/medias")
public class MediaController {
	
	//Service classes
	@Autowired
	private MediaService mediaService;

	@GetMapping
	public String index(Model model) {
		
		model.addAttribute("mediaList", mediaService.findMedia());
		
		return "/medias/index";
		
	}
} 
