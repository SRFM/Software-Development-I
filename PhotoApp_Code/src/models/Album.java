package models;

import java.util.ArrayList;

abstract public class Album {

    private String albumName;
    private ArrayList<Pages> albumPages;

    private int numOfPages = 0;

    public Album(String albumName) {

        this.albumName = albumName;
        albumPages = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public ArrayList<Pages> getAlbumPages() {
        return albumPages;
    }

    public void setAlbumPages(ArrayList<Pages> albumPages) {
        this.albumPages = albumPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String toString() {
        return albumName;
    }

    public abstract void addAlbumPage();
}
