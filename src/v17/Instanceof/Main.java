package v17.Instanceof;

public class Main {
    public static void main(String[] args)  {
        Shape rectangle = new Rectangle(6.6, 4.4);
        Shape circle = new Circle(6.4);
        Shape shape = null;

        // getPerimeter method
        try {
            System.out.println(Shape.getPerimeter(rectangle));
            System.out.println(Shape.getPerimeter(circle));
            System.out.println(Shape.getPerimeter(shape));
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }

        // getPerimeterGood method
        try {
            System.out.println(Shape.getPerimeterGood(rectangle));
            System.out.println(Shape.getPerimeterGood(circle));
            System.out.println(Shape.getPerimeterGood(shape));
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
