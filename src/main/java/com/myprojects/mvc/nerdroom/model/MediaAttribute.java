package com.myprojects.mvc.nerdroom.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "media-attributes")
public class MediaAttribute {
	
	//Definition of the class attributes
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Size(min = 2, max = 50)
		@NotBlank
		@Column
		private String name;
		
		@ManyToMany(mappedBy="mediaAttributes")
		private List<Media> medias;

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

		public List<Media> getMedias() {
			return medias;
		}

		public void setMedias(List<Media> medias) {
			this.medias = medias;
		}
		
		

}