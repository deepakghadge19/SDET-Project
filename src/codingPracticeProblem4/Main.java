package codingPracticeProblem4;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 12);
        Shape circle = new Circle(5);

        // Calculate area and perimeter of each shape
        System.out.println("\nArea and perimeter of various shapes:");
        System.out.println("\nRectangle: Length=10, Width=12");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println("\nCircle: Radius=5");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}
