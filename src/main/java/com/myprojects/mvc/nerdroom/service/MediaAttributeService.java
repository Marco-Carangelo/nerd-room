package com.myprojects.mvc.nerdroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojects.mvc.nerdroom.model.MediaAttribute;
import com.myprojects.mvc.nerdroom.repository.MediaAttributeRepository;

@Service
public class MediaAttributeService {
	
	//Injection of the repository interface
	@Autowired
	private MediaAttributeRepository repo;
		
	//Service methods
	
	//Index method
	public List<MediaAttribute> findMediaAttributes(){
		return repo.findAll();
	}
	
	//Create method
	public MediaAttribute createMediaAttribute(MediaAttribute mediaAttribute) {
		return repo.save(mediaAttribute);
	}
	
	//Update method
	public MediaAttribute updateMediaAttribute(MediaAttribute mediaAttribute) {
		return repo.save(mediaAttribute);
	}
	
	//Delete method
	public void deleteMediaAttribute(Integer id) {
		repo.deleteById(id);
	}

}
