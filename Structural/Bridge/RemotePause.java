// Refined Abstraction

// If I decide I want to further extend the remote I can
public class RemotePause extends Remote {

    public RemotePause(Device device) {
        super(device);
    }

    public void buttonNinePressed() {
        System.out.println("Paused");
    }

}
