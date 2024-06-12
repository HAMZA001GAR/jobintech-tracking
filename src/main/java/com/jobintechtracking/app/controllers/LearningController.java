package com.jobintechtracking.app.controllers;

import com.jobintechtracking.app.entities.Learning;
import com.jobintechtracking.app.entities.Steps;
import com.jobintechtracking.app.services.LearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/learnings")
public class LearningController {

    private final LearningService learningService;

    @Autowired
    public LearningController(LearningService learningService) {
        this.learningService = learningService;
    }

    @PostMapping
    public ResponseEntity<Learning> saveLearning(@RequestBody Learning learning) {
        Learning savedLearning = learningService.save(learning);
        return ResponseEntity.ok(savedLearning);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Learning> getLearningById(@PathVariable Long id) {
        Learning learning = learningService.findById(id);
        if (learning != null) {
            return ResponseEntity.ok(learning);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Learning>> getAllLearnings() {
        List<Learning> learnings = learningService.findAll();
        return ResponseEntity.ok(learnings);
    }
    @GetMapping(params = "stepsId")
    public ResponseEntity<List<Learning>> getStepsByFormationId(@RequestParam Long stepsId) {
        List<Learning> learnings = learningService.getStepsBystepsId(stepsId);
        return ResponseEntity.ok(learnings);
    }
}