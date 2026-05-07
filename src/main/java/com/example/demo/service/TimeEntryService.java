package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repository.TimeEntryRepository;

@Service
public class TimeEntryService {
    private final TimeEntryRepository repository;

    public TimeEntryService(TimeEntryRepository repository) {
        this.repository = repository;
    }
}
