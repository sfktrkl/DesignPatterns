import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {

    // Contains any Songs or SongGroups that are added to this ArrayList
    private ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();

    private String groupName;
    private String groupDescription;

    public SongGroup(String groupName, String groupDescription) {

        this.groupName = groupName;
        this.groupDescription = groupDescription;

    }

    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void add(SongComponent songComponent) {
        songComponents.add(songComponent);
    }

    public void remove(SongComponent songComponent) {
        songComponents.remove(songComponent);
    }

    public SongComponent getComponent(int componentIndex) {
        return songComponents.get(componentIndex);
    }

    public void displaySongInfo() {

        System.out.println(getGroupName() + " " + getGroupDescription() + "\n");
        // Cycles through and prints any Songs or SongGroups added
        // to this SongGroups ArrayList songComponents
        Iterator<SongComponent> songIterator = songComponents.iterator();
        while (songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();
            songInfo.displaySongInfo();
        }

    }

}
