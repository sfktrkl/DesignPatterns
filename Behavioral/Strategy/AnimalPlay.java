public class AnimalPlay {

    public static void main(String[] args) {

        // Create Dog and Bird objects
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        // Inform about their flying ability
        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

        // Dynamically change flying ability of the Dog
        sparky.setFlyingAbility(new ItFlys());
        // Inform about the new ability of the Dog :)
        System.out.println("Dog: " + sparky.tryToFly());

    }

}