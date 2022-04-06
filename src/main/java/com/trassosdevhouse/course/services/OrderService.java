package com.trassosdevhouse.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trassosdevhouse.course.entities.Order;
import com.trassosdevhouse.course.repositories.OrderRepository;

@Service
public class OrderService {	
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id); // estudar optional
		return obj.get(); // retorna um objeto dentro do Optional
	}
}
