package lt.sda.javaFundamentalsCoding.advanced.interfaces.example1;

public interface Shape {
    double getShape();
    double getPerimeter();

    default void printShape() {
        System.out.println("Shape: " + this.getClass().getSimpleName());
    }

}
