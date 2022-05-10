package songs.years;

import java.util.ArrayList;
import java.util.Iterator;

import songs.ISongIterator;
import songs.SongInfo;

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

    @Override
    public Iterator<SongInfo> createIterator() {
        return bestSongs.iterator();
    }

}
