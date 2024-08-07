package v17.Instanceof;

/*
The method getPerimeter performs the following:

1. A test to determine the type of the Shape object
2. A conversion, casting the Shape object to Rectangle or Circle, depending on the result of the instanceof operator
3. A destructuring, extracting either the length and width or the radius from the Shape object
 */
public interface Shape {
    // bad
    public static double getPerimeterBad(Shape shape) throws IllegalAccessException {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return 2 * rectangle.getLength() + 2 * rectangle.getWidth();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return 2 * circle.getRadius() + Math.PI;
        } else {
            throw new IllegalAccessException("Unrecognized shape");
        }
    }

    // good
    public static double getPerimeterGood(Shape shape) throws IllegalAccessException {
        if (shape instanceof Rectangle rectangle) {
            return 2 * rectangle.getLength() + 2 * rectangle.getWidth();
        } else if (shape instanceof Circle circle) {
            return 2 * circle.getRadius() + Math.PI;
        } else {
            throw new IllegalAccessException("Unrecognized shape");
        }
    }
}
