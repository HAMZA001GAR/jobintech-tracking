package com.jobintechtracking.app.entities;

import jakarta.persistence.*;

@Entity
public class Learning {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private String url;
    @ManyToOne
    @JoinColumn(name = "steps_id")
    private Steps steps;
}
