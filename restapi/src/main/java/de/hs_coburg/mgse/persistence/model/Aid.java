package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Aid")
@Table(name = "AID")
public class Aid {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "completeName", nullable = true)
    private String completeName;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<ModuleSpecification> moduleSpecifications = new ArrayList<ModuleSpecification>();

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public List<ModuleSpecification> getModuleSpecifications() {
        return moduleSpecifications;
    }

    public void setModuleSpecifications(List<ModuleSpecification> moduleSpecifications) {
        this.moduleSpecifications = moduleSpecifications;
    }
}
