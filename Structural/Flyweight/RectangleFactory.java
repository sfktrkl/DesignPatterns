import java.util.HashMap;

// This factory only creates a new rectangle if it 
// uses a color not previously used
public class RectangleFactory {

    // The HashMap uses the color as the key for every rectangle
    private static final HashMap<String, Rectangle> rectangles = new HashMap<String, Rectangle>();

    public static Rectangle getRectangle(String color) {
        Rectangle rect = rectangles.get(color);

        // Checks if a rectangle with a specific
        // color has been made. If not it makes a
        // new one, otherwise it returns one made already
        if (rect == null) {
            rect = new Rectangle(color);
            // Add new rectangle to HashMap
            rectangles.put(color, rect);
        }
        return rect;
    }
}
