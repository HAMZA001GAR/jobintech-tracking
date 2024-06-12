package com.jobintechtracking.app.services;

import com.jobintechtracking.app.entities.Formation;
import com.jobintechtracking.app.entities.Learning;
import com.jobintechtracking.app.repositories.FormationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormationService {

    private FormationRepository formationRepository;
    public FormationService(FormationRepository formationRepository) {
        this.formationRepository = formationRepository;
    }

    public Formation save(Formation formation) {
        return formationRepository.save(formation);
    }


    public Formation findById(Long id) {
        return  formationRepository.findById(id).orElse(null);
    }

    public List<Formation> findAll(){
        return formationRepository.findAll();
    }

    public Formation update(Formation formation) {
        return formationRepository.save(formation);
    }

    public void deleteById(Long id) {
        formationRepository.deleteById(id);
    }
}
