public class Bird extends Animal {

    public Bird() {
        super();

        // Set the Flys interface polymorphically
        // This sets the behavior as a flying Animal
        flyingType = new ItFlys();
    }

}