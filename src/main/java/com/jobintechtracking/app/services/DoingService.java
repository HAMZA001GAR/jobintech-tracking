package com.jobintechtracking.app.services;

import com.jobintechtracking.app.entities.Doing;
import com.jobintechtracking.app.entities.Formation;
import com.jobintechtracking.app.repositories.DoingRepository;

import java.util.List;

public class DoingService {

    DoingRepository doingRepository;
    public DoingService(DoingRepository doingRepository) {
        this.doingRepository = doingRepository;
    }

    public Doing save(Doing doing) {
        return doingRepository.save(doing);
    }


    public Doing findById(Long id) {
        return  doingRepository.findById(id).orElse(null);
    }

    public List<Doing> findAll(){
        return doingRepository.findAll();
    }
}
