package com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing;

import java.util.*;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    private Song findSong(String songName) {
        int i = 0;
        while(i < this.songs.size()) {
            if (this.songs.get(i).getTitle().equals(songName)) {
                System.out.println(songName + " found in song list.");
                return this.songs.get(i);
            }
            i++;
        }
        System.out.println("Cannot find " + songName + ".");
        return null;
    }

    public boolean addSong(String name, double duration) {
        if (findSong(name) != null) {
            System.out.println(name + " already exists in song list.");
            return false;
        }
        System.out.println("Added " + name + " to song list.");
        this.songs.add(new Song(name, duration));
        return true;
    }

    public boolean addToPlayList(int songIndex, LinkedList<Song> songLinkedList) {
        if (this.songs.size() <= songIndex) {
            System.out.println("That track number does not exist.");
            return false;
        }
        System.out.println("Added desired song with track number " + songIndex + ".");
        songLinkedList.add(this.songs.get(songIndex));
        return true;
    }

    public boolean addToPlayList(String songName, LinkedList<Song> songLinkedList) {
        if (findSong(songName) != null) {
            System.out.println("Added " + songName + " to song list.");
            songLinkedList.add(findSong(songName));
            return true;
        } else {
            System.out.println("Cannot find " + songName + ".");
            return false;
        }
    }
}
