package songs.years;

import java.util.Arrays;
import java.util.Iterator;

import songs.ISongIterator;
import songs.SongInfo;

public class SongsOfThe80s implements ISongIterator {
    
    SongInfo[] bestSongs;
    private int arrayValues = 0;

    public SongsOfThe80s() {

        bestSongs = new SongInfo[3];
        
        addSong("Roam", "B52s", 1989);
        addSong("Cruel Summer", "Bananarama", 1984);
        addSong("Head Over Heels", "Tears for Fears", 1985);
        
    }

    public void addSong(String songName, String artistName, int yearReleased){

        bestSongs[arrayValues] = new SongInfo(songName, artistName, yearReleased);
        arrayValues++;

    }

    @Override
    public Iterator<SongInfo> createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
    
}
