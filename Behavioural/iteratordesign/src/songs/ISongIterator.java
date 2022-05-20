package songs;

import java.util.Iterator;

//It ensures that every class to be queried has the createIterator method
public interface ISongIterator {
    
    public Iterator<SongInfo> createIterator();

}
