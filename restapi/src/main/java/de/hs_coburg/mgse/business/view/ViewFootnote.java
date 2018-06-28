package de.hs_coburg.mgse.business.view;

public class ViewFootnote {

    private int number;
    private String text;

    public ViewFootnote() { }

    public ViewFootnote(int number, String text) {
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
