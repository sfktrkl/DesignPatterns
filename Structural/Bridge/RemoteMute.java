// Refined Abstraction

// If I decide I want to further extend the remote I can
public class RemoteMute extends Remote {

    public RemoteMute(Device device) {
        super(device);
    }

    public void buttonNinePressed() {
        System.out.println("Muted");
    }

}
