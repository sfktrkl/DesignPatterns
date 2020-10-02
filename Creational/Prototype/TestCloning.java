public class TestCloning {

    public static void main(String[] args) {

        // Handles routing makeCopy method calls to the
        // right subclasses of Animal
        CloneFactory animalMaker = new CloneFactory();

        // Create a new Sheep instance
        Sheep sally = new Sheep("Sally");
        // Create a clone of Sally and it is store in its own memory location
        Sheep dolly = (Sheep) animalMaker.getClone(sally);

        // These are exact copies of each other
        System.out.println("Sally: " + sally);
        System.out.println("Dolly: " + dolly);

        // But their identities are different
        System.out.println("Sally Hashcode: " + System.identityHashCode(sally));
        System.out.println("Dolly Hashcode: " + System.identityHashCode(dolly));

    }

}
