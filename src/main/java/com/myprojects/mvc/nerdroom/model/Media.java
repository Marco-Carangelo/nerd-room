package com.myprojects.mvc.nerdroom.model;

import java.time.Year;

public class Media {
	
	//Clas attributes
	private String title;
	private String description;
	private Year year;
	
	//Getters and setters
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	
	

}
