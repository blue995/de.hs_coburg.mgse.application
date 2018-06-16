package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Module")
@Table(name = "MODULE")
public class Module {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<CourseTypeDeclaration> courseType = new ArrayList<CourseTypeDeclaration>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<ExamType> examTypes = new ArrayList<ExamType>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ModuleSpecification> moduleSpecifications = new ArrayList<ModuleSpecification>();

    @Column(name = "completeName", nullable = true)
    private String completeName;

    @Column(name = "ects", nullable = true)
    private int ects;

    @Column(name = "quantifier", nullable = true)
    private int quantifier;

    @Column(name = "semesterHours", nullable = true)
    private int semesterHours;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private GlossaryEntry details;

    @Column(name = "count", nullable = true)
    private int count;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<CourseTypeDeclaration> getCourseType() {
        return courseType;
    }

    public void setCourseType(List<CourseTypeDeclaration> courseType) {
        this.courseType = courseType;
    }

    public List<ExamType> getExamTypes() {
        return examTypes;
    }

    public void setExamTypes(List<ExamType> examTypes) {
        this.examTypes = examTypes;
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

    public int getQuantifier() {
        return quantifier;
    }

    public void setQuantifier(int quantifier) {
        this.quantifier = quantifier;
    }

    public int getSemesterHours() {
        return semesterHours;
    }

    public void setSemesterHours(int semesterHours) {
        this.semesterHours = semesterHours;
    }

    public GlossaryEntry getDetails() {
        return details;
    }

    public void setDetails(GlossaryEntry details) {
        this.details = details;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
