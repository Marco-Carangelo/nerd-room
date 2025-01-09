package com.myprojects.mvc.nerdroom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myprojects.mvc.nerdroom.model.Media;

public interface MediaRepository extends JpaRepository<Media, Integer> {

}
