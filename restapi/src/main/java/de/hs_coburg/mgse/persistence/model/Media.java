package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Media")
@Table(name = "MEDIA")
public class Media {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ModuleDescription> moduleDescriptions = new ArrayList<ModuleDescription>();

    @Column(name = "completeName", nullable = true)
    private String completeName;

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

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }
}
