package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;

@Entity(name = "GlossaryEntry")
@Table(name = "GLOSSARYENTRY")
public class GlossaryEntry {

    @Id @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "word", nullable = true)
    private String word;

    @Column(name = "meaning", nullable = true)
    private String meaning;

    @Column(name = "abbreviation", nullable = true)
    private String abbreviation;


    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}
