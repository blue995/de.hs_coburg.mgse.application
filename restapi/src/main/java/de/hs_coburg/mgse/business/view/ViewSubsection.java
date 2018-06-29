package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewSubsection {

    private int number;
    private List<String> text;

    public ViewSubsection() { }

    public ViewSubsection(int number, List<String> text) {
        this.number = number;
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }
}
