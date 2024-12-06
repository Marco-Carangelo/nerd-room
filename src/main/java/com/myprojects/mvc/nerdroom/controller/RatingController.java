package com.myprojects.mvc.nerdroom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.myprojects.mvc.nerdroom.service.RatingService;

@Controller
@RequestMapping("/ratings")
public class RatingController {
	
	//Service classes
	private RatingService ratingService;

}
