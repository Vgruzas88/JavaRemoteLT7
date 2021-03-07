package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_03;

public interface RegularPolygon {
    int getNumSides();
    int getSideLength();

    default void getPerimeter() {
        System.out.println("Perimeter of "
                + this.getClass().getSimpleName()
                + " is: "
                + (this.getNumSides() * this.getSideLength()));

    }

    default void getInteriorAngle() {
        System.out.println("Interior Angle of "
        +this.getClass().getSimpleName()
        + " is: "
        + ((this.getNumSides()-2)*180));

    }
}
