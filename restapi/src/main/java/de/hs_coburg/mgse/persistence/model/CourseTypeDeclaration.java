package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "CourseTypeDeclaration")
@Table(name = "COURSETYPEDECLARATION")
public class CourseTypeDeclaration {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Module> modules = new ArrayList<Module>();

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private GlossaryEntry details;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public GlossaryEntry getDetails() {
        return details;
    }

    public void setDetails(GlossaryEntry details) {
        this.details = details;
    }
}
