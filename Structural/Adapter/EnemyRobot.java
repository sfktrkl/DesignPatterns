// This is the Adaptee. The Adapter sends method calls
// to objects that use the EnemyAttacker interface
// to the right methods defined in EnemyRobot
public class EnemyRobot {

    public void smashWithHands() {
        int attackDamage = (int) (Math.random() * 10) + 1;
        System.out.println("Enemy Robot Causes " + attackDamage + " Damage With Its Hands");

    }

    public void walkForward() {
        int movement = (int) (Math.random() * 5) + 1;
        System.out.println("Enemy Robot Walks Forward " + movement + " spaces");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot Tramps on " + driverName);
    }

}
