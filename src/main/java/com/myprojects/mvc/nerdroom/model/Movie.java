package com.myprojects.mvc.nerdroom.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
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
	
	
	
	
	

}
