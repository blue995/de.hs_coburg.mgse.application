package de.hs_coburg.mgse.persistence.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "CourseOfStudies")
@Table(name = "COURSEOFSTUDIES")
public class CourseOfStudies {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "completeName", nullable = true)
    private String completeName;

    @Column(name = "ects", nullable = true)
    private int ects;

    @Column(name = "semester", nullable = true)
    private int semester;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<AdmissionRequirement> admissionRequirements = new ArrayList<AdmissionRequirement>();

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public List<AdmissionRequirement> getAdmissionRequirements() {
        return admissionRequirements;
    }

    public void setAdmissionRequirements(List<AdmissionRequirement> admissionRequirements) {
        this.admissionRequirements = admissionRequirements;
    }
}
