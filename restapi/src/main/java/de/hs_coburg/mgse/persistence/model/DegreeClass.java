package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "DegreeClass")
@Table(name = "DEGREECLASS")
public class DegreeClass {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "completeName", nullable = true)
    private String completeName;

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
}
