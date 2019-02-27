package com.ood.jukebox;

public class Song {
    int songId;
    private String songName;
    private int artistId;

    public int getId() {
        return songId;
    }

    public void setId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Override
    public String toString() {
        return "Song [id=" + songId + ", Song Name=" + songName + ", Artist id =" + artistId + "]";
    }

}
