// Concrete Implementor

// Here is an implementation of the Device abstract class.
// I'm specifying what makes it different from other devices.
public class DVD extends Device {

    public DVD(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    public void buttonFivePressed() {
        deviceState--;
        System.out.println("DVD Skips to Previous Chapter");
    }

    public void buttonSixPressed() {
        deviceState++;
        System.out.println("DVD Skips to Next Chapter");
    }

}
