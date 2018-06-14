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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    public void setSentences(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
