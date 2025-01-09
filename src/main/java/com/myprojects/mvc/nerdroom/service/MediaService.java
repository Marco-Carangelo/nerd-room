package com.myprojects.mvc.nerdroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojects.mvc.nerdroom.model.Media;
import com.myprojects.mvc.nerdroom.repository.MediaRepository;

@Service
public class MediaService {
	
	//Injection of the repository interface
	@Autowired
	private MediaRepository repo;
	
	//CRUD methods
	public List<Media> findMedia(){
		return repo.findAll();
		}
	

}
