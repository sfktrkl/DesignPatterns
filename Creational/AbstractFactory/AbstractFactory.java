// Create an Abstract class to get factories for Normal and Rounded Shape Objects. 

// Create Factory classes extending AbstractFactory to generate object of concrete class based on given information.
// They will be ShapeFactory and RoundedShapeFactory
public abstract class AbstractFactory {

    abstract Shape getShape(String shapeType);

}
