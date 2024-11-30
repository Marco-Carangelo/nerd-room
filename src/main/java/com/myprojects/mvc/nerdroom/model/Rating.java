package com.myprojects.mvc.nerdroom.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ratings")
public class Rating {
	
	//Class Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Max(100)
	@Min(0)
	@NotNull
	@Column
	private Integer value = 0;
	
	//Relationships
	@ManyToOne
	@JoinColumn(name = "media_id", nullable = false)
	private Media medias;
	
	@ManyToOne
	@JoinColumn(name = "media-attribute_id", nullable = false)
	private MediaAttribute mediaAttributes;

	//Getters and Setters
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public Media getMedia() {
		return media;
	}

	public void setMedia(Media media) {
		this.media = media;
	}

	public MediaAttribute getMediaAttribute() {
		return mediaAttribute;
	}

	public void setMediaAttribute(MediaAttribute mediaAttribute) {
		this.mediaAttribute = mediaAttribute;
	}
	

}
