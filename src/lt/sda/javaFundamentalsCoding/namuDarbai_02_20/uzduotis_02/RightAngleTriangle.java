package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_02;

public class RightAngleTriangle extends Shape {

    protected double width;
    protected double length;

    public RightAngleTriangle(String shapeDescription, double width, double length) {
        super(shapeDescription);
        this.width = width;
        this.length = length;
    }

    @Override
    public String getArea() {
        return shapeDescription + " area is: " + (width*length) * 2;
    }
}
