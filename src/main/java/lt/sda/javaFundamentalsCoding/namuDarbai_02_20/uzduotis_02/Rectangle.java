package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_02;

public class Rectangle extends RightAngleTriangle {
    public Rectangle(String shapeDescription, double width, double length) {

        super(shapeDescription, width, length);
    }

    public String getArea() {
        return shapeDescription + " area is: " + width * length;
    }
}
