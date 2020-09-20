package com.company.Learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Song {
    private String title;
    private  double duration;

    public boolean addingSongsToPlayList(LinkedList playList, String addSong){
        //playList.add(addSong);
        ListIterator<String> playListIterator = playList.listIterator();
        while (playListIterator.hasNext()){
            int comparison = playListIterator.next().compareTo(addSong);
             if(comparison == 0){
                 System.out.println("Song is present in the Album.");
                 playListIterator.previous();
                 playListIterator.add(addSong);
                 return true;
             }else {
                 System.out.println("Please add the songs that are present in the album.");
                 return false;
             }
        }
            playListIterator.add(addSong);
        return true;
    }

}
