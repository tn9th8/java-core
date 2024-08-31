package V17.Instanceof;

public class Rectangle implements Shape {
    // attribute
    final double length;
    final double width;

    // constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // getter
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}
