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
    @JoinColumn(nullable = true)
    private List<CourseTypeDeclaration> courseType = new ArrayList<CourseTypeDeclaration>();

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true) //false
    private List<ExamType> examTypes = new ArrayList<ExamType>();
    /*
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ModuleSpecification> moduleSpecifications = new ArrayList<ModuleSpecification>();
    */
    @Column(name = "completeName", nullable = true)
    private String completeName;

    @Column(name = "ects", nullable = true)
    private Integer ects;

    @Column(name = "quantifier", nullable = true)
    private Double quantifier;

    @Column(name = "semesterHours", nullable = true)
    private Integer semesterHours;

    @Column(name = "moduleType", nullable = true)
    private String moduleType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private GlossaryEntry details;

    @Column(name = "count", nullable = true)
    private Integer count;

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
    /*
    public List<ModuleSpecification> getModuleSpecifications() {
        return moduleSpecifications;
    }

    public void setModuleSpecifications(List<ModuleSpecification> moduleSpecifications) {
        this.moduleSpecifications = moduleSpecifications;
    }
    */
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

    public Double getQuantifier() {
        return quantifier;
    }

    public void setQuantifier(Double quantifier) {
        this.quantifier = quantifier;
    }

    public Integer getSemesterHours() {
        return semesterHours;
    }

    public void setSemesterHours(Integer semesterHours) {
        this.semesterHours = semesterHours;
    }

    public GlossaryEntry getDetails() {
        return details;
    }

    public void setDetails(GlossaryEntry details) {
        this.details = details;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getModuleType() {
        return moduleType;
    }

    public void setModuleType(String moduleType) {
        this.moduleType = moduleType;
    }
}
