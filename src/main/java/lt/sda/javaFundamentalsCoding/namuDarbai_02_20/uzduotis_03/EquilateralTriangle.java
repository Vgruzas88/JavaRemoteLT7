package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_03;

public class EquilateralTriangle implements RegularPolygon{
    int length;

    public EquilateralTriangle(int length) {
        this.length = length;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return length;
    }
}
