package songs.years;

import java.util.ArrayList;
import java.util.Iterator;

import songs.ISongIterator;
import songs.SongInfo;

//An class that holds objects in a unique way
public class SongsOfThe70s implements ISongIterator {
    
    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {

        bestSongs = new ArrayList<>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don Mclean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1979);

    }

    public void addSong(String songName, String artistName, int yearReleased) {

        bestSongs.add(new SongInfo(songName, artistName, yearReleased));

    }

    //The iterator design pattern in action by creation a particular iterator for the class itself
    @Override
    public Iterator<SongInfo> createIterator() {
        return bestSongs.iterator();
    }

}
