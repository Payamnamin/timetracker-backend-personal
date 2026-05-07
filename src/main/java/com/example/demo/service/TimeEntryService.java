package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.TimeEntry;
import com.example.demo.repository.TimeEntryRepository;

@Service
public class TimeEntryService {
    private final TimeEntryRepository repository;

    public TimeEntryService(TimeEntryRepository repository) {
        this.repository = repository;
    }

    public TimeEntry createTimeEntry(TimeEntry timeEntry) {
        return repository.save(timeEntry);
    }

    public List<TimeEntry> getTimeEntriesByUser(String userId) {
        return repository.findByUserId(userId);
    }

    public List<TimeEntry> getAllTimeEntries(String userId) {
        return repository.findByUserId(userId);
    }

    public void deleteTimeEntry(String id) {
        repository.deleteById(id);
    }
    
}
