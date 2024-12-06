package com.myprojects.mvc.nerdroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojects.mvc.nerdroom.model.Rating;
import com.myprojects.mvc.nerdroom.repository.RatingRepository;

@Service
public class RatingService {

	@Autowired
	private RatingRepository repo;
	
	//CRUD methods
	
	//Create method
	public Rating createRating(Rating rating) {
		return repo.save(rating);
	}
	
	//Update method
	public Rating updateRating(Rating rating) {
		return repo.save(rating);
	}
	
	
}
