import java.util.HashMap;

// The Flyweight design pattern is used when you need to
// create a large number of similar objects

// To reduce memory this pattern shares Objects that are 
// the same rather than creating new ones
public class FlyweightTest {

    public static void main(String[] args) {

        HashMap<Integer, Rectangle> testRectangles = new HashMap<Integer, Rectangle>();
        for (int i = 0; i < 1000; ++i) {
            Rectangle rectangle = new Rectangle(getRandomColor());
            rectangle.draw(getRandomValue(), getRandomValue(), getRandomValue(), getRandomValue());
            testRectangles.put(System.identityHashCode(rectangle), rectangle);
        }

        HashMap<Integer, Rectangle> flyweightRectangles = new HashMap<Integer, Rectangle>();
        for (int i = 0; i < 1000; ++i) {
            // Uses rectangles stored in the HashMap to speed up the program
            Rectangle rectangle = RectangleFactory.getRectangle(getRandomColor());
            rectangle.draw(getRandomValue(), getRandomValue(), getRandomValue(), getRandomValue());
            flyweightRectangles.put(System.identityHashCode(rectangle), rectangle);
        }

        System.out.println("Test case created " + testRectangles.size() + " instances.");
        System.out.println("Flyweight case created " + flyweightRectangles.size() + " instances.");

    }

    private static String getRandomColor() {
        String[] colors = { "Red", "Green", "Blue" };
        return colors[((int) (Math.random() * 3))];
    }

    private static int getRandomValue() {
        return (int) (Math.random() * 100);
    }

}