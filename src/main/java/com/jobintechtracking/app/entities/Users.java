package com.jobintechtracking.app.entities;

import jakarta.persistence.*;

@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private String email;
    @Enumerated(EnumType.STRING)
    private Roles role;
}
