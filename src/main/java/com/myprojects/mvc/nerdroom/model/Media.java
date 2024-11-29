package com.myprojects.mvc.nerdroom.model;

import java.time.Year;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

@Entity(name = "medias")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "media_type",
discriminatorType = DiscriminatorType.STRING)
public class Media {
	
	//Class attributes
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
	
	@PastOrPresent
	@Column
	private Year year;
	
	@Size(min = 5, max = 3000)
	@Column
	private String evalText;
	
	//ManyToMany relationships
	@ManyToMany()
	@JoinTable(
			name = "media_media-attribute",
			joinColumns = @JoinColumn(name = "media_id"),
			inverseJoinColumns = @JoinColumn(name = "media-attribute_id"))
	private List<MediaAttribute> mediaAttributes;
	
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
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}

	public String getEvalText() {
		return evalText;
	}

	public void setEvalText(String evalText) {
		this.evalText = evalText;
	}

	public List<MediaAttribute> getMediaAttributes() {
		return mediaAttributes;
	}

	public void setMediaAttributes(List<MediaAttribute> mediaAttributes) {
		this.mediaAttributes = mediaAttributes;
	}
	
	

}