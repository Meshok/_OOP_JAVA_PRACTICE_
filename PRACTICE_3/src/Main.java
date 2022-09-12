import Classes.*;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        System.out.println(circle);
        System.out.println("Площадь: " + Double.toString(circle.getArea()));
        System.out.println("Периметр: " + Double.toString(circle.getPerimeter()));
        Rectangle rectangle = new Rectangle(2, 5);
        System.out.println(rectangle);
        System.out.println("Площадь: " + Double.toString(rectangle.getArea()));
        System.out.println("Периметр: " + Double.toString(rectangle.getPerimeter()));
        Square square = new Square(3);
        System.out.println(square);
        System.out.println("Площадь: " + Double.toString(square.getArea()));
        System.out.println("Периметр: " + Double.toString(square.getPerimeter()));
    }
}
