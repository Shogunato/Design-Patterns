package converter;

import java.util.Iterator;

import songs.ISongIterator;
import songs.SongInfo;

public class DiskJockey {
    
    ISongIterator iterator;
    ISongIterator songsOfThe70s;
    ISongIterator songsOfThe80s;
    ISongIterator songsOfThe90s;

    public DiskJockey(ISongIterator songsOfThe70s, ISongIterator songsOfThe80s, ISongIterator songsOfThe90s) {
        
        this.songsOfThe70s = songsOfThe70s;
        this.songsOfThe80s = songsOfThe80s;
        this.songsOfThe90s = songsOfThe90s;

    }

    public void showSongs() {

        System.out.println("Songs of the 70s:");
        printSongs(songsOfThe70s);
        System.out.println("Songs of the 80s:");
        printSongs(songsOfThe80s);
        System.out.println("Songs of the 90s");
        printSongs(songsOfThe90s);

    }

    public void printSongs(ISongIterator iterator) {

        Iterator<SongInfo> songIterator = iterator.createIterator();

        while(songIterator.hasNext()) {
            
            SongInfo songInfo = songIterator.next();
            System.out.println(songInfo.getSongName()+", "+songInfo.getBandName()+", "+songInfo.getYearReleased());

        }
        System.out.println();
    }

}
