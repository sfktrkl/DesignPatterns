public class TestChain {

    public static void main(String[] args) {

        // Here I define all of the objects in the chain
        Chain add = new Add();
        Chain subtract = new Subtract();
        Chain multiply = new Multiply();
        Chain divide = new Divide();

        // Here I tell each object where to forward the
        // data if it can't process the request
        add.setNextChain(subtract);
        subtract.setNextChain(multiply);
        multiply.setNextChain(divide);

        // Define the data in the Numbers Object
        // and send it to the first Object in the chain
        Calculation request = new Calculation(4, 2, "add");
        add.calculate(request);

    }

}
