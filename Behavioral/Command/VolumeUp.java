// Command
public class VolumeUp implements Command {

    ElectronicDevice device;

    public VolumeUp(ElectronicDevice newDevice) {
        device = newDevice;
    }

    public void execute() {
        device.volumeUp();
    }

    public void undo() {
        device.volumeDown();
    }

}
