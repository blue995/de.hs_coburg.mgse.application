package de.hs_coburg.mgse.business.view;

public class ViewGlossaryEntry {
    private long id;
    private String word;
    private String abbreviation;
    private String description;

    public ViewGlossaryEntry() { }

    public ViewGlossaryEntry(long id, String word, String abbreviation, String description) {
        this.id = id;
        this.word = word;
        this.abbreviation = abbreviation;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
