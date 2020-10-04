// A Template Method Pattern contains a method that provides
// the steps of the algorithm. It allows subclasses to override 
// some of the methods
public abstract class Hoagie {

    String[] meatUsed = { "Salami", "Pepperoni", "Capicola Ham" };
    String[] cheeseUsed = { "Provolone" };
    String[] veggiesUsed = { "Lettuce", "Tomatoes", "Onions", "Sweet Peppers" };
    String[] condimentsUsed = { "Oil", "Vinegar" };

    // This is the Template Method
    // Declare this method final to keep subclasses from
    // changing the algorithm
    final void makeSandwich() {

        cutBun();

        if (customerWantsMeat())
            addMeat();

        if (customerWantsCheese())
            addCheese();

        if (customerWantsVegetables())
            addVegetables();

        if (customerWantsCondiments())
            addCondiments();

        wrapTheHoagie();

    }

    // These are called hooks
    // If the user wants to override these they can

    // Use abstract methods when you want to force the user
    // to override and use a hook when you want it to be optional
    boolean customerWantsMeat() {
        return true;
    }

    boolean customerWantsCheese() {
        return true;
    }

    boolean customerWantsVegetables() {
        return true;
    }

    boolean customerWantsCondiments() {
        return true;
    }

    public void cutBun() {
        System.out.print("\nThe Hoagie is Cut");
    }

    // These methods must be overridden by the extending subclasses
    abstract void addMeat();

    abstract void addCheese();

    abstract void addVegetables();

    abstract void addCondiments();

    public void wrapTheHoagie() {
        System.out.print("\nWrap the Hoagie");
    }

}
