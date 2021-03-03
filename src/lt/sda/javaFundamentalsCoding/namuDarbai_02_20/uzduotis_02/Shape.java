package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_02;

public abstract class Shape {

    protected String shapeDescription;

    public Shape(String shapeDescription) {
        this.shapeDescription = shapeDescription;
    }

    public abstract String getArea();
}
