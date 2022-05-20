package songs.years;

import java.util.Hashtable;
import java.util.Iterator;

import songs.ISongIterator;
import songs.SongInfo;

//An class that holds objects in a unique way
public class SongsOfThe90s implements ISongIterator{
    
    Hashtable<Integer, SongInfo> bestSongs;
    private int hashtableKey;

    public SongsOfThe90s() {

        bestSongs = new Hashtable<>();
        hashtableKey = 0;

        addSong("Losing my Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad the Wet Sprocket", 1991);

    }

    public void addSong(String songName, String artistName, int yearReleased) {

        bestSongs.put(hashtableKey, new SongInfo(songName, artistName, yearReleased));
        hashtableKey ++;

    }

    //The iterator design pattern in action by creation a particular iterator for the class itself
    @Override
    public Iterator<SongInfo> createIterator() {
        return bestSongs.values().iterator();
    }


}
