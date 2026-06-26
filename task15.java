// Step 1: Define the Shape interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Step 2: Abstract class that implements Shape
abstract class AbstractShape implements Shape {
    String color;
    double length;
    double width;

    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }
}

// Step 3a: Concrete class Circle
class Circle extends AbstractShape {
    double radius;

    public Circle(String color, double radius) {
        super(color, 0, 0); // length and width not used in Circle
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Step 3b: Concrete class Rectangle
class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Step 4: Main class
public class task15 {
    public static void main(String[] args) {

        Circle circle = new Circle("Red", 5);
        System.out.println("--- Circle ---");
        System.out.println("Color: " + circle.color);
        System.out.println("Radius: " + circle.radius);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        Rectangle rectangle = new Rectangle("Blue", 4, 6);
        System.out.println("\n--- Rectangle ---");
        System.out.println("Color: " + rectangle.color);
        System.out.println("Length: " + rectangle.length);
        System.out.println("Width: " + rectangle.width);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}