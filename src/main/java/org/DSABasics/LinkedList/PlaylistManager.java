package org.DSABasics.LinkedList;

import java.util.LinkedList;

public class PlaylistManager {
    public static void main(String[] args) {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song 1");
        playlist.add("Song 3");

        // Scenario: You want to insert "Song 2" between 1 and 3.
        // In an ArrayList, this shifts everything. In LinkedList, it's efficient.
        int index = playlist.indexOf("Song 1");
        if (index != -1) {
            playlist.add(index + 1, "Song 2");
        }

        // Fast insertion at the absolute front (O(1))
        playlist.addFirst("Intro Track");

        System.out.println("Playlist: " + playlist);
    }
}
