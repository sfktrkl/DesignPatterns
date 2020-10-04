// Will hold all of the info needed for each song
public class SongInfo {

    private String songName;
    private String bandName;
    private int yearReleased;

    public SongInfo(String newSongName, String newBandName, int newYearReleased) {

        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearReleased;

    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getYearReleased() {
        return yearReleased;
    }

}