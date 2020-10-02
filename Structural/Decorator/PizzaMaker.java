public class PizzaMaker {

    public static void main(String[] args) {

        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor
        Pizza pizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        System.out.println("Ingredients: " + pizza.getDescription());
        System.out.println("Price: " + pizza.getCost());

    }

}
