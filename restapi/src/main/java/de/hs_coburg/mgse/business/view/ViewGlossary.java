package de.hs_coburg.mgse.business.view;

import java.util.List;

public class ViewGlossary {

    private long id;
    private List<ViewGlossarySection> sections;

    public ViewGlossary() { }

    public ViewGlossary(long id, List<ViewGlossarySection> sections) {
        this.id = id;
        this.sections = sections;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<ViewGlossarySection> getSections() {
        return sections;
    }

    public void setSections(List<ViewGlossarySection> sections) {
        this.sections = sections;
    }
}
