package com.myprojects.mvc.nerdroom.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
@DiscriminatorValue("movie")
public class Movie extends Media {
	
	//Definition of the class attributes

	@Size(min = 2, max = 50)
	@Column
	private String director;
	
	@Size(min = 2, max = 50)
	@Column
	private String genre;
	
	//Getters and setters

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	
	
	
	
	
	

}
