package de.hs_coburg.mgse.persistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "Paragraph")
@Table(name = "PARAGRAPH")
public class Paragraph extends AParagraph {

    @Column(name = "number", nullable = true)
    private int number;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(nullable = true)
    private List<SubParagraph> subParagraphs = new ArrayList<SubParagraph>();

    //getter and setter
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    public List<SubParagraph> getSubParagraphs() {
        return subParagraphs;
    }

    public void setSubParagraphs(List<SubParagraph> subParagraphs) {
        this.subParagraphs = subParagraphs;
    }
}
