package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Faculty")
@Table(name = "FACULTY")
public class Faculty {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "completeName", nullable = true)
    private String completeName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Professor> professors = new ArrayList<Professor>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<CourseOfStudies> courseOfStudies = new ArrayList<CourseOfStudies>();

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

    public List<Professor> getProfessors() {
        return professors;
    }

    public void setProfessors(List<Professor> professors) {
        this.professors = professors;
    }

    public List<CourseOfStudies> getCourseOfStudies() {
        return courseOfStudies;
    }

    public void setCourseOfStudies(List<CourseOfStudies> courseOfStudies) {
        this.courseOfStudies = courseOfStudies;
    }
}
