public class AbstractFactoryDemo {

    public static void main(String[] args) {

        // Get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        shapeFactory.getShape("RECTANGLE").draw();
        shapeFactory.getShape("SQUARE").draw();

        // Get rounded shape factory
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
        roundedShapeFactory.getShape("RECTANGLE").draw();
        roundedShapeFactory.getShape("SQUARE").draw();

    }

}
