package com.jobintechtracking.app.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Steps {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "formation_id")
    private Formation formation;

    @Enumerated(EnumType.STRING)
    private StepProcess stepProcess;

}
