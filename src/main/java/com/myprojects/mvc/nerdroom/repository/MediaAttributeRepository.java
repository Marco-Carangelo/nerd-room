package com.myprojects.mvc.nerdroom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.mvc.nerdroom.model.MediaAttribute;


public interface MediaAttributeRepository extends JpaRepository<MediaAttribute, Integer>{
	
	//Repository custom methods
	public List<MediaAttribute> findByNameStartingWithIgnoreCase(String text);
	
	public List<MediaAttribute> findByCategoryId(Integer id);

}
