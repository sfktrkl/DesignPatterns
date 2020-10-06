// A flyweight objects essentially has two kind of attributes – intrinsic and extrinsic. 
// Intrinsic State: Color, stored/shared context, immutable
// Extrinsic State: X & Y Values, cannot be shared, needed to passed
public class Rectangle {

    private String color;

    public Rectangle(String color) {
        this.color = color;
    }

    public void draw(int upperX, int upperY, int lowerX, int lowerY) {
        System.out.println(color + " Rectangle drawn at,");
        System.out.println("X: " + upperX + ", " + lowerX + ", Y: " + upperY + ", " + lowerY);
    }

}
