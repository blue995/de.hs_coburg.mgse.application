package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Footnote")
@Table(name = "FOOTNOTE")
public class Footnote {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Sentence> sentences = new ArrayList<Sentence>();

    @Column(name = "text", nullable = true)
    private String text;

    //getter and setter

}
