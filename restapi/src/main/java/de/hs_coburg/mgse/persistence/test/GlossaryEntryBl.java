package de.hs_coburg.mgse.persistence.test;

import java.util.Random;

public class GlossaryEntryBl {

    protected long id;
    protected String name;

    public GlossaryEntryBl(String name) {
        this.id = new Random().nextLong();
        if (this.id < 0) this.id = (long) (this.id * (-1.0));
        this.name = name;
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
}
