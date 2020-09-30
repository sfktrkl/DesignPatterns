// This class will totaly encapsulate the ship creation.
// So, when something has to be modified, there will
// be only one place to look at.
public class EnemyShipFactory {

    // This could be used as a static method if we
    // are willing to give up subclassing it
    public EnemyShip makeEnemyShip(String shipType) {

        if (shipType.equals("U")) {
            return new UFOEnemyShip();
        } else if (shipType.equals("R")) {
            return new RocketEnemyShip();
        } else if (shipType.equals("B")) {
            return new BigUFOEnemyShip();
        } else
            return null;

    }

}
