package de.hs_coburg.mgse.persistence.test;


import java.util.List;
import java.util.ArrayList;
import java.util.Random;


public class Glossary {

    protected long id;
    protected String name;
    protected List<GlossarySection> section_list;

    public Glossary(String name) {
        this.id = new Random().nextLong();
        if (this.id < 0) this.id = (long) (this.id * (-1.0));
        this.name = name;
        this.section_list = new ArrayList<>();

        this.section_list.add(new GlossarySection("Section One"));
        this.section_list.add(new GlossarySection("Section Two"));
        this.section_list.add(new GlossarySection("Section Three"));
    }

    public Glossary(Glossary glossary) {
        this.id = glossary.id;
        this.name = glossary.name;
        this.section_list = glossary.section_list;
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

    public List<GlossarySection> getSectionList() {
        return section_list;
    }

    public void setSectionList(List<GlossarySection> section_list) {
        this.section_list = section_list;
    }
}
