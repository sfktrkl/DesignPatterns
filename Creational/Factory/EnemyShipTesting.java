import java.util.Scanner;

public class EnemyShipTesting {

    public static void main(String[] args) {

        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);
        System.out.println("What type of ship? ('U', 'R', 'B')");
        if (userInput.hasNextLine()) {
            String shipType = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(shipType);
        }
        userInput.close();

        if (theEnemy != null) {
            theEnemy.displayEnemyShip();
            theEnemy.followHeroShip();
            theEnemy.enemyShipShoots();
        }
    }
}
