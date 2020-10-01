// The director/engineer class creates a Robot using the
// builder interface that is defined (ASIMOBuilder)
public class RobotEngineer {

    private RobotBuilder robotBuilder;

    // ASIMOBuilder specification will be sent to the engineer
    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    // Return the Robot made from the ASIMOBuilder spec
    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    // Execute the methods specific to the RobotBuilder
    // that implements RobotBuilder (ASIMOBuilder)
    public void makeRobot() {
        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();
    }

}
