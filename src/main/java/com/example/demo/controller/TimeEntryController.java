package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TimeEntry;
import com.example.demo.service.TimeEntryService;

@RestController
@RequestMapping("/time-entries")
public class TimeEntryController {
    
    private final TimeEntryService service;

    public TimeEntryController(TimeEntryService service) {
        this.service = service;
    }

    @PostMapping
    public TimeEntry createTimeEntry(@RequestBody TimeEntry timeEntry) {
        return service.createTimeEntry(timeEntry);
    }
}
