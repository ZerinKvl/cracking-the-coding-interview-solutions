package com.ood.jukebox;

import java.util.Queue;

public class PlayList {
    int playListId;
    String playListName;
    Queue<Song> songsInPlayList;

    public int getPlayListId() {
        return playListId;
    }

    public void setPlayListId(int playListId) {
        this.playListId = playListId;
    }

    public String getPlayListName() {
        return playListName;
    }

    public void setPlayListName(String playListName) {
        this.playListName = playListName;
    }

    public Song getNextSongToPlay() {
        return songsInPlayList.peek();
    }

    public void addToPlayList(Song songName) {
        songsInPlayList.add(songName);

    }

}
