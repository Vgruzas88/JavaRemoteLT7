package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_04;

public class Mobile {

    private String model;
    private String manufacturer;
    private double price;

    Mobile(String model, String manufacturer, double price) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public String getModel() { return model; }
    public String getManufacturer() { return manufacturer; }
    public double getPrice() { return price; }
}
