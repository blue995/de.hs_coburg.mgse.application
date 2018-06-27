package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewGlossarySection {

    private long id;
    private List<ViewGlossaryEntry> entries;

    public ViewGlossarySection() { }

    public ViewGlossarySection(long id, List<ViewGlossaryEntry> entries) {
        this.id = id;
        this.entries = entries;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ViewGlossaryEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<ViewGlossaryEntry> entries) {
        this.entries = entries;
    }
}
