// The concrete builder class that assembles the parts 
// of the finished Robot object
public class ASIMOBuilder implements RobotBuilder {

    private Robot robot;

    public ASIMOBuilder() {
        this.robot = new Robot();
    }

    public void buildRobotHead() {
        robot.setRobotHead("Tin Head");
    }

    public void buildRobotTorso() {
        robot.setRobotTorso("Tin Torso");
    }

    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch Arms");
    }

    public void buildRobotLegs() {
        robot.setRobotLegs("Rollar Skates");
    }

    public Robot getRobot() {
        return this.robot;
    }

}
