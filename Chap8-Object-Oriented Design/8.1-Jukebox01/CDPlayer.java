package com.ood.jukebox;

public class CDPlayer {

    private PlayList playlist;
    private CD cd;

    public CDPlayer(PlayList playlist, CD cd) {
        super();
        this.playlist = playlist;
        this.cd = cd;
    }

    public PlayList getPlaylist() {
        return playlist;
    }

    public void setPlaylist(PlayList playlist) {
        this.playlist = playlist;
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

}
