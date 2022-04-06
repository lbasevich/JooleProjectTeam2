package com.javatraining.jooleprojectteam2.Entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ProjectProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectProductId; //PK

    @ManyToOne
    @JoinColumn(name="project_id", referencedColumnName="projectId")
    Project project;  //FK

    @ManyToOne
    @JoinColumn(name="resource_id", referencedColumnName="resourceId")
    Product product;  //FK

    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date timeCreated;

    // Constructors
    public ProjectProduct() {
    }

    public ProjectProduct(Project project, Product product) {
        this.project = project;
        this.product = product;
        this.timeCreated = new Date();
    }

    // Getter and Setters
    public int getProjectProductId() {
        return projectProductId;
    }

    public void setProjectProductId(int projectProductId) {
        this.projectProductId = projectProductId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Date getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Date timeCreated) {
        this.timeCreated = timeCreated;
    }
}