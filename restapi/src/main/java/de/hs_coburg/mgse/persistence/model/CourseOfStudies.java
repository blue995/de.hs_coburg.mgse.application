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
    private Integer ects;

    @Column(name = "semester", nullable = true)
    private Integer semester;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<AdmissionRequirement> requirements = new ArrayList<AdmissionRequirement>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private Degree degree;

    /*
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<StudyExaminationRegulations> ser = new ArrayList<StudyExaminationRegulations>();
    */
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

    public Integer getEcts() {
        return ects;
    }

    public void setEcts(Integer ects) {
        this.ects = ects;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    public List<AdmissionRequirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(List<AdmissionRequirement> requirements) {
        this.requirements = requirements;
    }

    /*
    public List<StudyExaminationRegulations> getSer() {
        return ser;
    }

    public void setSer(List<StudyExaminationRegulations> ser) {
        this.ser = ser;
    }*/

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
