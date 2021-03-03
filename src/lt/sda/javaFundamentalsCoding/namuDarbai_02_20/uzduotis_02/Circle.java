package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_02;

public class Circle extends Shape {

    private double radius;

    public Circle(String shapeDescription, double radius) {
        super(shapeDescription);
        this.radius = radius;
    }
    @Override
    public String getArea() {
        return shapeDescription +" area is: " + Math.PI * radius * radius;
    }

    public String getPerimeter() {
        return shapeDescription + " length is: " + (Math.PI * (radius * 2));
    }
}
