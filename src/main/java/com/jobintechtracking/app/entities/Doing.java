package com.jobintechtracking.app.entities;

import jakarta.persistence.*;

@Entity
public class Doing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    @ManyToOne
    @JoinColumn(name = "steps_id")
    private Steps steps;
}
