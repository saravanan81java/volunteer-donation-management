package com.example.demo.controller;

import com.example.demo.model.Volunteer;
import com.example.demo.repository.VolunteerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/volunteers")
public class VolunteerController {

    @Autowired
    private VolunteerRepository volunteerRepository;

    @GetMapping
    public List<Volunteer> getAllVolunteers() {
        return volunteerRepository.findAll();
    }

    @PostMapping
    public Volunteer createVolunteer(@RequestBody Volunteer volunteer) {
        return volunteerRepository.save(volunteer);
    }
}
