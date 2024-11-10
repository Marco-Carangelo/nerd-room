package com.myprojects.mvc.nerdroom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

import java.util.Date;

import jakarta.persistence.Column;

@Entity
@Table(name = "movies")
public class Movie {
	
	//Definition of the class attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Size(min = 2, max = 50)
	@NotBlank
	@Column
	private String title;
	
	
	@Size(min = 5, max = 1000)
	@Column
	private String description;
	
	@Size(min = 2, max = 50)
	@NotBlank
	@Column
	private String genre;
	
	@Past
	@Column
	private Date year;
	
	
	//Getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getYear() {
		return year;
	}

	public void setYear(Date year) {
		this.year = year;
	}
	
	
	
	
	
	
	

}
