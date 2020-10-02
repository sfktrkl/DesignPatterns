public class PlayWithRemote {

    public static void main(String[] args) {

        // Gets the ElectronicDevice to use
        ElectronicDevice tv = new Television();

        // TurnTVOn contains the command to turn on the tv
        // When execute() is called on this command object
        // it will execute the method on() in Television
        Remote remote = new Remote(new TurnOn(tv));

        // When press() is called command.execute(); executes
        remote.press();

        // Now when execute() is called volumeUp() of Television executes
        remote = new Remote(new VolumeUp(tv));
        remote.press();

        // It is common to be able to undo a command in a command pattern To do so,
        // DeviceButton will have a method called undo Undo() will perform the opposite
        // action that the normal Command performs. undo() needs to be added to every
        // class with an execute()
        remote.pressUndo();

        // Now when execute() is called off() of Television executes
        remote = new Remote(new TurnOff(tv));
        remote.press();

    }

}
