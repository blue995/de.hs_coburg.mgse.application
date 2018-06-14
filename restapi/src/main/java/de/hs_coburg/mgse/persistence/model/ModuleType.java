package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "ModuleType")
@Table(name = "MODULETYPE")
public class ModuleType {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Module> modules = new ArrayList<Module>();

    @Column(name = "typeName", nullable = true)
    private String typeName;

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

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
