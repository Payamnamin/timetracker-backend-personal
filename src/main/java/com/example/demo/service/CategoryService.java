package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;

@Service
public class CategoryService {

private final CategoryRepository repository;

public CategoryService(CategoryRepository repository) {
       this.repository =  repository;
    }

public Category createCategory(Category category) {

        return repository.save(category);

    }

    public List<Category> getAllCategories(String userId) {

        return repository.findByUserId(userId);

    }



    
}
