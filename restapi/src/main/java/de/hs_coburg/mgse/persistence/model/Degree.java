package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Degree")
@Table(name = "DEGREE")
public class Degree {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private GlossaryEntry glossaryEntry;

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

    public GlossaryEntry getGlossaryEntry() {
        return glossaryEntry;
    }

    public void setGlossaryEntry(GlossaryEntry glossaryEntry) {
        this.glossaryEntry = glossaryEntry;
    }

    public List<CourseOfStudies> getCourseOfStudies() {
        return courseOfStudies;
    }

    public void setCourseOfStudies(List<CourseOfStudies> courseOfStudies) {
        this.courseOfStudies = courseOfStudies;
    }
}
