package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity(name = "Curriculum")
@Table(name = "CURRICULUM")
public class Curriculum {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private StudyExaminationRegulations ser;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<ModuleSpecification> moduleSpecifications = new ArrayList<ModuleSpecification>();
    /*
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ModuleHandbook> moduleHandbooks = new ArrayList<ModuleHandbook>();
    */
    @Column(name = "completeName", nullable = true)
    private String completeName;

    @Column(name = "version", nullable = true)
    private Integer version;

    @Column(name = "semester", nullable = true)
    private String semester;

    @Column(name = "year", nullable = true)
    private Integer year;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StudyExaminationRegulations getSer() {
        return ser;
    }

    public void setSer(StudyExaminationRegulations ser) {
        this.ser = ser;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    /*
    public List<ModuleHandbook> getModuleHandbooks() {
        return moduleHandbooks;
    }

    public void setModuleHandbooks(List<ModuleHandbook> moduleHandbooks) {
        this.moduleHandbooks = moduleHandbooks;
    }
    */
    public List<ModuleSpecification> getModuleSpecifications() {
        return moduleSpecifications;
    }

    public void setModuleSpecifications(List<ModuleSpecification> moduleSpecifications) {
        this.moduleSpecifications = moduleSpecifications;
    }
}
