package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Sentence")
@Table(name = "SENTENCE")
public class Sentence {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<Footnote> footnotes = new ArrayList<Footnote>();

    @Column(name = "text", nullable = true)
    private String text;

    //getter and setter

}
