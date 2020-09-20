package com.company.Learn;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Albums albums = new Albums();
        ArrayList<String> albumArrayList = new ArrayList<String>();
        LinkedList<String> myPlayList = new LinkedList<String>();
        albumArrayList.add("Senorita");
        albumArrayList.add("Girls Like You");
        albumArrayList.add("Give Me Some Sunshine");
        albumArrayList.add("Despacito");
        albumArrayList.add("Bella Ciao");
        albumArrayList.add("I Don't Care");
        albumArrayList.add("Memories");
        albumArrayList.add("Champion");
        albums.printAlbumContent(albumArrayList);
        Song song = new Song();
        myPlayList.add("Champion");
        song.addingSongsToPlayList(myPlayList,"Memories");

    }
}
