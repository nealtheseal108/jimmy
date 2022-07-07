package com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString(Song song) {
        return song.title + ": " + song.duration;
    }
}
