package lt.sda.javaFundamentalsCoding.advanced.interfaces.example1;

public class Square implements Shape {
    private double length;

    public Square (double length) {
        this.length = length;
    }

    @Override
    public double getShape() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }
}
