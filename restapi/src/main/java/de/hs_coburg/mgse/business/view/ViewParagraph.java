package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewParagraph {

    private int number;
    private List<String> sentences;
    private String subtitle;
    private List<ViewSubsection> subsections;

    public ViewParagraph() { }

    public ViewParagraph(int number, String subtitle, List<String> sentences, List<ViewSubsection> subsections) {
        this.number = number;
        this.subtitle = subtitle;
        this.sentences = sentences;
        this.subsections = subsections;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<ViewSubsection> getSubsections() {
        return subsections;
    }

    public void setSubsections(List<ViewSubsection> subsections) {
        this.subsections = subsections;
    }

    public List<String> getSentences() {
        return sentences;
    }

    public void setSentences(List<String> sentences) {
        this.sentences = sentences;
    }
}
