public class TestEnemyAttackers {

    public static void main(String[] args) {

        EnemyRobot robot = new EnemyRobot();
        System.out.println("\nThe Robot");
        robot.reactToHuman("Paul");
        robot.walkForward();
        robot.smashWithHands();

        EnemyTank tank = new EnemyTank();
        System.out.println("\nThe Enemy Tank");
        tank.assignDriver("Frank");
        tank.driveForward();
        tank.fireWeapon();

        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
        System.out.println("\nThe Robot with Adapter");
        robotAdapter.assignDriver("Mark");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();

    }

}