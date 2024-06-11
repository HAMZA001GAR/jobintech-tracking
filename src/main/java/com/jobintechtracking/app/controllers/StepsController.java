package com.jobintechtracking.app.controllers;

import com.jobintechtracking.app.entities.Steps;
import com.jobintechtracking.app.services.StepsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/steps")
public class StepsController {

    private final StepsService stepsService;

    @Autowired
    public StepsController(StepsService stepsService) {
        this.stepsService = stepsService;
    }

    @PostMapping
    public ResponseEntity<Steps> saveSteps(@RequestBody Steps steps) {
        Steps savedSteps = stepsService.save(steps);
        return ResponseEntity.ok(savedSteps);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Steps> getStepsById(@PathVariable Long id) {
        Steps steps = stepsService.findById(id);
        if (steps != null) {
            return ResponseEntity.ok(steps);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Steps>> getAllSteps() {
        List<Steps> steps = stepsService.findAll();
        return ResponseEntity.ok(steps);
    }
}