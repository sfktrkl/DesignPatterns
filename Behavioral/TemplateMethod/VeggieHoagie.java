public class VeggieHoagie extends Hoagie {

    // Override the hooks
    boolean customerWantsMeat() {
        return false;
    }

    boolean customerWantsCheese() {
        return false;
    }

    void addMeat() {
    }

    void addCheese() {
    }

    public void addVegetables() {

        System.out.print("\nAdding the Vegetables: ");
        for (String vegetable : veggiesUsed)
            System.out.print(vegetable + " ");

    }

    public void addCondiments() {

        System.out.print("\nAdding the Condiments: ");
        for (String condiment : condimentsUsed)
            System.out.print(condiment + " ");

    }

}
