package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "ModuleHandbook")
@Table(name = "MODULEHANDBOOK")
public class ModuleHandbook {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private Curriculum curriculum;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ModuleDescription> moduleDescriptions = new ArrayList<ModuleDescription>();

    // Why?
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(nullable = true)
//    private Curriculum curriculum;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ModuleDescription> getModuleDescriptions() {
        return moduleDescriptions;
    }

    public void setModuleDescriptions(List<ModuleDescription> moduleDescriptions) {
        this.moduleDescriptions = moduleDescriptions;
    }

    public Curriculum getCurriculum() {
        return curriculum;
    }

    public void setCurriculum(Curriculum curriculum) {
        this.curriculum = curriculum;
    }
}
