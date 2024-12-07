package com.myprojects.mvc.nerdroom.model;

import com.myprojects.mvc.nerdroom.elements.AttributeCategory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
		
		@Column
		@Enumerated(EnumType.STRING)
		private AttributeCategory category;
		

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

		public AttributeCategory getCategory() {
			return category;
		}

		public void setCategory(AttributeCategory category) {
			this.category = category;
		}

		
		

}
