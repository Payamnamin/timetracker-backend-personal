package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Category;

public interface CategoryRepository extends MongoRepository<Category, String>{
    
    // Get category by user
    List<Category> findByUserId(String userId);
}
