package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Child;

@Repository
public interface ChildRepository extends JpaRepository<Child, Integer> {
	
	public Child findByidchild(Integer id);
	
	
}
