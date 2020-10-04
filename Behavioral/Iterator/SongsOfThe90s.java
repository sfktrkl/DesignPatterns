import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

    // Create a Hashtable with an int as a key and SongInfo Objects
    private Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();

    // Will increment the Hashtable key
    private int hashKey = 0;

    public SongsOfThe90s() {
        addSong("Losing My Religion", "REM", 1991);
        addSong("Creep", "Radiohead", 1993);
        addSong("Walk on the Ocean", "Toad The Wet Sprocket", 1991);
    }

    // Add a new SongInfo to the Hashtable and then increment the Hashtable key
    public void addSong(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey, songInfo);
        hashKey++;
    }

    // By adding this method I'll be able to treat all collections the same
    public Iterator<SongInfo> createIterator() {
        return bestSongs.values().iterator();
    }

}
