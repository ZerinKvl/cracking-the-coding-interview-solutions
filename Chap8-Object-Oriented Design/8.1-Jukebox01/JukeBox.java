package com.ood.jukebox;

import java.util.Set;

public class JukeBox {
    private CDPlayer cdplayer;
    private Set<CD> cdCollection;

    public CDPlayer getCdplayer() {
        return cdplayer;
    }

    public void setCdplayer(CDPlayer cdplayer) {
        this.cdplayer = cdplayer;
    }

    public Set<CD> getCdCollection() {
        return cdCollection;
    }

    public void setCdCollection(Set<CD> cdCollection) {
        this.cdCollection = cdCollection;
    }

    public JukeBox(CDPlayer cdplayer, Set<CD> cdCollection) {
        super();
        this.cdplayer = cdplayer;
        this.cdCollection = cdCollection;

    }

}
