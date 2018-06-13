package de.hs_coburg.mgse.persistence.test;


import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class GlossaryBl {

    protected long id;
    protected String name;
    protected List<GlossarySectionBl> section_list;

    public GlossaryBl(String name) {
        this.id = new Random().nextLong();
        if (this.id < 0) this.id = (long) (this.id * (-1.0));
        this.name = name;
        this.section_list = new ArrayList<>();

        this.section_list.add(new GlossarySectionBl("Section One"));
        this.section_list.add(new GlossarySectionBl("Section Two"));
        this.section_list.add(new GlossarySectionBl("Section Three"));
    }

    public GlossaryBl(GlossaryBl glossaryBl) {
        this.id = glossaryBl.id;
        this.name = glossaryBl.name;
        this.section_list = glossaryBl.section_list;
    }

    public long getID() {
        return id;
    }

    public void setID(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<GlossarySectionBl> getSectionList() {
        return section_list;
    }

    public void setSectionList(List<GlossarySectionBl> section_list) {
        this.section_list = section_list;
    }
}
