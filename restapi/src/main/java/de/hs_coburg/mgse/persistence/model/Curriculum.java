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

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = false)
    private List<ModuleSpecification> moduleSpecifications = new ArrayList<ModuleSpecification>();

    @Column(name = "version", nullable = true)
    private Integer version;

    @Column(name = "semester", nullable = true)
    private String semester;

    @Column(name = "year", nullable = true)
    private Integer year;

    @Column(name = "date", nullable = true)
    private Date date;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ModuleSpecification> getModuleSpecifications() {
        return moduleSpecifications;
    }

    public void setModuleSpecifications(List<ModuleSpecification> moduleSpecifications) {
        this.moduleSpecifications = moduleSpecifications;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
