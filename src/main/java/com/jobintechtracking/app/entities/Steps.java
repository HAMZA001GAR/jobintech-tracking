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

    public  Steps () { }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Formation getFormation() {
        return formation;
    }

    public void setFormation(Formation formation) {
        this.formation = formation;
    }

    public StepProcess getStepProcess() {
        return stepProcess;
    }

    public void setStepProcess(StepProcess stepProcess) {
        this.stepProcess = stepProcess;
    }

}
