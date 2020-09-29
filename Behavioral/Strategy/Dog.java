public class Dog extends Animal {

    public Dog() {
        super();

        // Set the Flys interface polymorphically
        // This sets the behavior as a non-flying Animal
        flyingType = new CantFly();
    }

}
