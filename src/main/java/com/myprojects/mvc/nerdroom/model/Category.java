package com.myprojects.mvc.nerdroom.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "categories")
public class Category {

	//Definition of the class attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Size(min = 2, max = 50)
	@NotBlank
	@Column
	private String name;
	
	//Relationship mapping fields
	
	@OneToMany(mappedBy = "category", cascade = {CascadeType.REMOVE})
	private List<MediaAttribute> mediaAttributes;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MediaAttribute> getMediaAttributes() {
		return mediaAttributes;
	}

	public void setMediaAttributes(List<MediaAttribute> mediaAttributes) {
		this.mediaAttributes = mediaAttributes;
	}
			
	
			
}
