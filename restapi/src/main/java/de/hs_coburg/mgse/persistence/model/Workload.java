package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;

@Entity(name = "Workload")
@Table(name = "WORKLOAD")
public class Workload {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "effort", nullable = true)
    private Integer effort;

    @Column(name = "description", nullable = true)
    private String description;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEffort() {
        return effort;
    }

    public void setEffort(Integer effort) {
        this.effort = effort;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
