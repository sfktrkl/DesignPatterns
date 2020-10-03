// EnemyTank implements EnemyAttacker perfectly
// Our job is to make classes with different methods
// from EnemyAttacker to work with the EnemyAttacker interface
public class EnemyTank implements EnemyAttacker {

    public void fireWeapon() {
        int attackDamage = (int) (Math.random() * 10) + 1;
        System.out.println("Enemy Tank Does " + attackDamage + " Damage");
    }

    public void driveForward() {
        int movement = (int) (Math.random() * 5) + 1;
        System.out.println("Enemy Tank moves " + movement + " spaces");
    }

    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }

}
