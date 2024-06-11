package com.jobintechtracking.app.repositories;

import com.jobintechtracking.app.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormationRepository extends JpaRepository<Formation, Long> {
}
