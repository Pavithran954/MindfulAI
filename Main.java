class Shapes {
    public double perimeter() {
        return 0.0; // Default implementation, to be overridden by subclasses
    }
}

class Circle extends Shapes {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square extends Shapes {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double perimeter() {
        return 4 * side;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        System.out.println("Perimeter of Circle: " + circle.perimeter());
        System.out.println("Perimeter of Square: " + square.perimeter());
    }
}
