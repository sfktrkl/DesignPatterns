// Abstraction

// This is an abstract class that will represent numerous
// ways to work with each device
public abstract class Remote {

    // A reference to a generic device using aggregation
    private Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void deviceFeedback() {
        device.deviceFeedback();
    }

    public void buttonFivePressed() {
        device.buttonFivePressed();
    }

    public void buttonSixPressed() {
        device.buttonSixPressed();
    }

    public void buttonSevenPressed() {
        device.buttonSevenPressed();
    }

    public void buttonEightPressed() {
        device.buttonEightPressed();
    }

    public abstract void buttonNinePressed();

}
