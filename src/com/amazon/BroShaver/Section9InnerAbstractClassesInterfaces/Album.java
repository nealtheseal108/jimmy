package com.amazon.BroShaver.Section9InnerAbstractClassesInterfaces;

import com.amazon.BroShaver.Section8ArraysListsUnboxingAutoboxing.Song;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;

    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        boolean doesExist = false;
        for (int i = 0; i < this.songs.songs.size(); i++) {
            if (this.songs.songs.get(i).getTitle().equals(title)) {
                doesExist = true;
                break;
            }
        }
        if (!doesExist) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }


    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if((index >0) && (index <= this.songs.songs.size())) {
            playList.add(this.songs.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song;
        for (int i = 0; i < this.songs.songs.size(); i++) {
            if (this.songs.songs.get(i).getTitle().equals(title)) {
                song = this.songs.songs.get(i);
                playList.add(song);
                return true;
            }
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private static class SongList {
        private ArrayList<Song> songs;
        public SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (findSong(song.getTitle()) == null) {
                this.songs.add(song);
                return true;
            } else {
                return false;
            }
        }

        private Song findSong(String title) {
            for(int i = 0; i < this.songs.size(); i++) {
                if(this.songs.get(i).getTitle().equals(title)) {
                    return this.songs.get(i);
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if (this.songs.size() > trackNumber) {
                return this.songs.get(trackNumber);
            } else {
                return null;
            }
        }
    }
}