package com.trassosdevhouse.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trassosdevhouse.course.entities.Category;
import com.trassosdevhouse.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;

	public List<Category> findAll() {
		return repository.findAll();
	}

	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id); // estudar optional
		return obj.get(); // retorna um objeto dentro do Optional
	}
}
