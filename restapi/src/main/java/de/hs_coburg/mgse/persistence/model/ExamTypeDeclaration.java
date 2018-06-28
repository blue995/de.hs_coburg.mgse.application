package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "ExamTypeDeclaration")
@Table(name = "EXAMTYPEDECLARATION")
public class ExamTypeDeclaration {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    /*
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ExamType> examTypes = new ArrayList<ExamType>();
    */
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private GlossaryEntry details;

    @Column(name = "unit", nullable = true)
    private String unit;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /*
    public List<ExamType> getExamTypes() {
        return examTypes;
    }

    public void setExamTypes(List<ExamType> examTypes) {
        this.examTypes = examTypes;
    }
    */

    public GlossaryEntry getDetails() {
        return details;
    }

    public void setDetails(GlossaryEntry details) {
        this.details = details;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
