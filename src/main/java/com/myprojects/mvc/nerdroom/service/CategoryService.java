package com.myprojects.mvc.nerdroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myprojects.mvc.nerdroom.model.Category;
import com.myprojects.mvc.nerdroom.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repo;
	
	
	//CRUD METHODS
	
	public List<Category> findCategories(){
		return repo.findAll();
	}
	
	public Category createCategory(Category category){
		return repo.save(category);
	}
	
	public void deleteCategory(Integer id) {
		repo.deleteById(id);
	}
	

}
