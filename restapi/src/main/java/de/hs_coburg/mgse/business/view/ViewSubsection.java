package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewSubsection {

    private int number;
    private String text;

    public ViewSubsection() { }

    public ViewSubsection(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
