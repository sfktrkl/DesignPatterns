public class TestRemote {

    public static void main(String[] args) {

        Remote tv = new RemoteMute(new TV(1, 200));
        System.out.println("\nTest TV with Mute");
        pressAllButtons(tv);

        Remote tv2 = new RemotePause(new TV(1, 200));
        System.out.println("\nTest TV with Pause");
        pressAllButtons(tv2);

        Remote dvd = new RemoteMute(new DVD(1, 200));
        System.out.println("\nTest DVD with Mute");
        pressAllButtons(dvd);

        Remote dvd2 = new RemotePause(new DVD(1, 200));
        System.out.println("\nTest DVD with Pause");
        pressAllButtons(dvd2);

    }

    private static void pressAllButtons(Remote remote) {
        remote.buttonFivePressed();
        remote.buttonSixPressed();
        remote.buttonSevenPressed();
        remote.buttonEightPressed();
        remote.buttonNinePressed();
        remote.deviceFeedback();
    }

}
