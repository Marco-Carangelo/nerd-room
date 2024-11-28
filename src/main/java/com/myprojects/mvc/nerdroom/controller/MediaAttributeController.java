package com.myprojects.mvc.nerdroom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myprojects.mvc.nerdroom.service.MediaAttributeService;

@Controller
@RequestMapping("/media-attributes")
public class MediaAttributeController {

	//Service Classes
	@Autowired
	private MediaAttributeService mediaAttributeService;
	
}
