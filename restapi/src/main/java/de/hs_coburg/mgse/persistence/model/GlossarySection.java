package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "GlossarySection")
@Table(name = "GLOSSARYSECTION")
public class GlossarySection {

    @Id @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = true)
    private String completeName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<GlossaryEntry> entries = new ArrayList<GlossaryEntry>();

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

    public List<GlossaryEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<GlossaryEntry> entries) {
        this.entries = entries;
    }
}
