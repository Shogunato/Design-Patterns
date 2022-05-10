package songs.years;

import java.util.Hashtable;
import java.util.Iterator;

import songs.ISongIterator;
import songs.SongInfo;

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

    @Override
    public Iterator<SongInfo> createIterator() {
        return bestSongs.values().iterator();
    }


}
