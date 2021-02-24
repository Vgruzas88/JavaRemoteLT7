package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_06;

public class House {

    private double houseArea;
    private String district;
    private int builtYear;
    private String condition;


    House(double houseArea, String district, int builtYear, String condition) {
        this.houseArea = houseArea;
        this.district = district;
        this.builtYear = builtYear;
        this.condition = condition;
    }

    public double getHouseArea() { return houseArea; }
    public String getDistrict() { return district; }
    public int getBuiltYear() { return builtYear; }
    public String getCondition() {return condition; }

    @Override
    public String toString() {
        return "House: Area is: " + houseArea + ", district: " + district + ", year built: " + builtYear + ", condition: " + condition;
    }
}
