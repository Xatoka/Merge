
public class Square implements Shape {
    double side;
    final static int NUMBER_OF_SIDES =4;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getPerimeter() {
        return side*NUMBER_OF_SIDES;
    }
}
