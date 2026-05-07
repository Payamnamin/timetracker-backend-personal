package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.TimeEntry;

public interface TimeEntryRepository extends MongoRepository<TimeEntry, String> {

    List<TimeEntry> findByUserId(String userId);
    
}
