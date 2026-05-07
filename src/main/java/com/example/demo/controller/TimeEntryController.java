package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TimeEntryService;

@RestController
@RequestMapping("/time-entries")
public class TimeEntryController {
    
    private final TimeEntryService service;

    public TimeEntryController(TimeEntryService service) {
        this.service = service;
    }
}
