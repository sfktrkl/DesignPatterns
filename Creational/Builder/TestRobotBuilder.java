public class TestRobotBuilder {

    public static void main(String[] args) {

        // Get a RobotBuilder(blueprint) of type ASIMOBuilder
        RobotBuilder asimoBuilder = new ASIMOBuilder();

        // Pass the ASIMOBuilder specification to the engineer
        RobotEngineer robotEngineer = new RobotEngineer(asimoBuilder);

        // Tell the engineer to make the Robot using the specifications
        // of the ASIMOBuilder class
        robotEngineer.makeRobot();

        // The engineer returns the right robot based off of the specifications
        Robot asimo = robotEngineer.getRobot();
        System.out.println("Robot Built");
        System.out.println("Robot Head Type: " + asimo.getRobotHead());
        System.out.println("Robot Torso Type: " + asimo.getRobotTorso());
        System.out.println("Robot Arm Type: " + asimo.getRobotArms());
        System.out.println("Robot Leg Type: " + asimo.getRobotLegs());

    }

}
