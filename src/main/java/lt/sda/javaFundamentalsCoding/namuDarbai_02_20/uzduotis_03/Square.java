package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_03;

public class Square implements RegularPolygon{

    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return length;
    }
}
