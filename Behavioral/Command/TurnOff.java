// Command
public class TurnOff implements Command {

    ElectronicDevice device;

    public TurnOff(ElectronicDevice newDevice) {
        device = newDevice;
    }

    public void execute() {
        device.off();
    }

    // Used if you want to allow for undo
    // Do the opposite of execute()
    public void undo() {
        device.on();
    }

}