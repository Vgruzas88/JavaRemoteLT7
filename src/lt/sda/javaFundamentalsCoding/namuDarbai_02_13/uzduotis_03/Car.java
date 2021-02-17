package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_03;

class Car {

    private String model;
    private double engine;
    private int year;
    private double price;
    private String type;

  Car(String model, double engine, int year, double price, String type) {
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    public String getModel() {
        return model;
    }
    public double getEngine() {
        return engine;
    }
    public int getYear() { return year; }
    public double getPrice() {
        return price;
    }
    public String getType() {
        return type;
    }
}
