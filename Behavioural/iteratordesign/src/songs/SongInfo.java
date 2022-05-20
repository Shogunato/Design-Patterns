package songs;

//Object to be stored in multiple classes
public class SongInfo {
    
    private String artistName;
    private String songName;
    private int yearReleased;

    public SongInfo(String songName, String artistName, int yearReleased) {

        this.artistName = artistName;
        this.songName = songName;
        this.yearReleased = yearReleased;

    }

    public String getBandName(){return artistName;}
    public String getSongName(){return songName;}
    public int getYearReleased(){return yearReleased;}

}
