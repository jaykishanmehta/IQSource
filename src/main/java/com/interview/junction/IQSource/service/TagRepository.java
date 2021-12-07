package com.interview.junction.IQSource.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.interview.junction.IQSource.model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {
	
}
