package com.myprojects.mvc.nerdroom.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "ratings")
public class Rating {
	
	@Max(100)
	@Min(0)
	@NotNull
	@Column
	private Integer value = 0;
	
	@ManyToOne
	@JoinColumn(name = "media_id", nullable = false)
	private Media media;
	
	

}
