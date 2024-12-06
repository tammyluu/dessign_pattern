package org.example;

import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
        System.out.println(song + " has been added to the playlist.");
    }

    public void removeSong(Song song) {
        songs.remove(song);
        System.out.println(song + " has been removed from the playlist.");
    }

    public void showPlaylist() {
        System.out.println("\nCurrent Playlist:");
        for (Song song : songs) {
            System.out.println("- " + song);
        }
        System.out.println();
    }
}
