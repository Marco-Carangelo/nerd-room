package com.myprojects.mvc.nerdroom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojects.mvc.nerdroom.repository.MediaAttributeRepository;

@Service
public class MediaAttributeService {
	
	//Injection of the repository interface
		@Autowired
		private MediaAttributeRepository repo;

}
