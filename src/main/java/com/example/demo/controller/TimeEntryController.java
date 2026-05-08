package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TimeEntry;
import com.example.demo.service.TimeEntryService;
@CrossOrigin(origins="*")
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

    @GetMapping("/{userId}")
    public List<TimeEntry> getTimeEntriesByUser(@PathVariable String userId) {

        return service.getTimeEntriesByUser(userId);
    }

    @DeleteMapping("/{id}")
    public void deleteTimeEntry(@PathVariable String id) {

        service.deleteTimeEntry(id);
    }
}
