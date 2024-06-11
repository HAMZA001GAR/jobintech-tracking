
package com.jobintechtracking.app.controllers;

import com.jobintechtracking.app.entities.Formation;
import com.jobintechtracking.app.services.FormationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formations")
public class FormationController {
    private final FormationService formationService;
    @Autowired
    public FormationController(FormationService formationService) {
        this.formationService = formationService;
    }

    @PostMapping
    public ResponseEntity<Formation> saveFormation(@RequestBody Formation formation) {
        Formation savedFormation = formationService.save(formation);
        return ResponseEntity.ok(savedFormation);
    }

    @GetMapping
    public ResponseEntity<List<Formation>> getAllFormations() {
        List<Formation> formations = formationService.findAll();
        return ResponseEntity.ok(formations);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Formation> getFormationById(@PathVariable Long id) {
        Formation formation = formationService.findById(id);
        if (formation != null) {
            return ResponseEntity.ok(formation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
