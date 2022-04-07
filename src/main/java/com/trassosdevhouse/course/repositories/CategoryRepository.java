package com.trassosdevhouse.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trassosdevhouse.course.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category , Long>{

}
