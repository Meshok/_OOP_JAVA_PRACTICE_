package Classes;

public class Square extends Rectangle {
    public Square() {}

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "Квадрат со сторонами " + Double.toString(width);
    }
}
