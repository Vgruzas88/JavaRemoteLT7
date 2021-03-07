package lt.sda.javaFundamentalsCoding.advanced.interfaces.example1;

public class InterfaceMainExample {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(2,4);
        System.out.println(rectangle.getShape());
        rectangle.printShape();

        Square square = new Square(4);
        System.out.println(square.getPerimeter());

        square.printShape();
    }
}
