import java.util.Iterator;

public class DiscJockey {

    // Passing in song iterators
    private SongIterator iter70sSongs;
    private SongIterator iter80sSongs;
    private SongIterator iter90sSongs;

    // Initialize the iterators
    public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {
        iter70sSongs = newSongs70s;
        iter80sSongs = newSongs80s;
        iter90sSongs = newSongs90s;
    }

    // Because the SongInfo Objects are stored in different
    // collections everything must be handled on an individual
    // basis if iterator design did not used.

    // Now that I can treat everything as an Iterator it cleans up
    // the code while allowing me to treat all collections as one
    public void showTheSongs() {

        System.out.println("Iterator way\n");
        Iterator<SongInfo> Songs70s = iter70sSongs.createIterator();
        Iterator<SongInfo> Songs80s = iter80sSongs.createIterator();
        Iterator<SongInfo> Songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(Songs70s);

        System.out.println("Songs of the 80s\n");
        printTheSongs(Songs80s);

        System.out.println("Songs of the 90s\n");
        printTheSongs(Songs90s);

    }

    public void printTheSongs(Iterator<SongInfo> iterator) {

        while (iterator.hasNext()) {
            SongInfo songInfo = iterator.next();
            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased() + "\n");
        }

    }

}
