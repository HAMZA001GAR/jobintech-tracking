package com.jobintechtracking.app.services;

import com.jobintechtracking.app.entities.Learning;
import com.jobintechtracking.app.entities.Steps;
import com.jobintechtracking.app.repositories.LearningRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearningService {

    LearningRepository learningRepository;
    public LearningService(LearningRepository learningRepository) {
        this.learningRepository = learningRepository;
    }

    public Learning save(Learning learning) {
        return learningRepository.save(learning);
    }


    public Learning findById(Long id) {
        return  learningRepository.findById(id).orElse(null);
    }

    public List<Learning> findAll(){
        return learningRepository.findAll();
    }

    public List<Learning> getStepsBystepsId(Long stepsId) {
        return learningRepository.findBystepsId(stepsId);
    }

}
