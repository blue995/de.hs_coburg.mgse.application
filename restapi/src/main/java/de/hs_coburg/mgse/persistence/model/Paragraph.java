package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Paragraph")
@Table(name = "PARAGRAPH")
public class Paragraph extends AParagraph {

    @Column(name = "title", nullable = true)
    private String title;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<SubParagraph> subParagraphs = new ArrayList<SubParagraph>();

    //getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubParagraph> getSubParagraphs() {
        return subParagraphs;
    }

    public void setSubParagraphs(List<SubParagraph> subParagraphs) {
        this.subParagraphs = subParagraphs;
    }
}
