// Concrete Implementor

// Here is an implementation of the Device abstract class.
// I'm specifying what makes it different from other devices.
public class TV extends Device {

    public TV(int newDeviceState, int newMaxSetting) {
        deviceState = newDeviceState;
        maxSetting = newMaxSetting;
    }

    public void buttonFivePressed() {
        deviceState--;
        System.out.println("Channel Down");
    }

    public void buttonSixPressed() {
        deviceState++;
        System.out.println("Channel Up");
    }

}
