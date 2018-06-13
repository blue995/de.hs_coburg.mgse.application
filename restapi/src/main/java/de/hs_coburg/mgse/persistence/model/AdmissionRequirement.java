package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "AdmissionRequirement")
@Table(name = "ADMISSIONREQUIREMENT")
public class AdmissionRequirement {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "value", nullable = true)
    private String value;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<CourseOfStudies> courseOfStudies = new ArrayList<CourseOfStudies>();

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<CourseOfStudies> getCourseOfStudies() {
        return courseOfStudies;
    }

    public void setCourseOfStudies(List<CourseOfStudies> courseOfStudies) {
        this.courseOfStudies = courseOfStudies;
    }
}
