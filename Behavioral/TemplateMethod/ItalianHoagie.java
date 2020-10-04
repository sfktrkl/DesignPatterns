public class ItalianHoagie extends Hoagie {

    public void addMeat() {

        System.out.print("\nAdding the Meat: ");
        for (String meat : meatUsed)
            System.out.print(meat + " ");

    }

    public void addCheese() {

        System.out.print("\nAdding the Cheese: ");
        for (String cheese : cheeseUsed)
            System.out.print(cheese + " ");

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
