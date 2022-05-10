import converter.DiskJockey;
import songs.years.*;

public class IteratorMain {
    
    public static void main(String[] args) {

        DiskJockey dj = new DiskJockey(new SongsOfThe70s(), new SongsOfThe80s(), new SongsOfThe90s());

        dj.showSongs();
        
    }

}
