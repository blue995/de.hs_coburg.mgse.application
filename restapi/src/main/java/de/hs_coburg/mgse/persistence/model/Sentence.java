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

    @Column(name = "text", nullable = true, columnDefinition="TEXT")
    private String text;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Footnote> getFootnotes() {
        return footnotes;
    }

    public void setFootnotes(List<Footnote> footnotes) {
        this.footnotes = footnotes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
