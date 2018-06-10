package de.hs_coburg.mgse.persistence.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GlossarySection {

    protected long id;
    protected String name;
    protected List<GlossaryEntry> entry_list;

    public GlossarySection(String name) {
        this.id = new Random().nextLong();
        if (this.id < 0) this.id = (long) (this.id * (-1.0));
        this.name = name;
        this.entry_list = new ArrayList<>();

        this.entry_list.add(new GlossaryEntry("Entry One"));
        this.entry_list.add(new GlossaryEntry("Entry Two"));
        this.entry_list.add(new GlossaryEntry("Entry Three"));
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

    public List<GlossaryEntry> getEntryList() {
        return entry_list;
    }
}
