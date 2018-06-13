package de.hs_coburg.mgse.persistence.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GlossarySectionBl {

    protected long id;
    protected String name;
    protected List<GlossaryEntryBl> entry_list;

    public GlossarySectionBl(String name) {
        this.id = new Random().nextLong();
        if (this.id < 0) this.id = (long) (this.id * (-1.0));
        this.name = name;
        this.entry_list = new ArrayList<>();

        this.entry_list.add(new GlossaryEntryBl("Entry One"));
        this.entry_list.add(new GlossaryEntryBl("Entry Two"));
        this.entry_list.add(new GlossaryEntryBl("Entry Three"));
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

    public List<GlossaryEntryBl> getEntryList() {
        return entry_list;
    }
}
