package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_03;

public class RegularPolygonMain {

    public static void main(String[] args) {

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(12);
        Square square = new Square(3);

        equilateralTriangle.getPerimeter();
        equilateralTriangle.getInteriorAngle();
        square.getPerimeter();
        square.getInteriorAngle();
    }
}
