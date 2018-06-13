package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Glossary")
@Table(name = "GLOSSARY")
public class Glossary {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<GlossarySection> sections = new ArrayList<GlossarySection>();

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<GlossarySection> getSections() {
        return sections;
    }

    public void setSections(List<GlossarySection> sections) {
        this.sections = sections;
    }
}
