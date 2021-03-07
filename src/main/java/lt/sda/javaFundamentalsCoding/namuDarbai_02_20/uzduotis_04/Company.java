package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_04;

import java.util.ArrayList;
import java.util.List;

public class Company {

    public String name;
    public String address;
    public ProductionType productionType;
    public List<Device> devices;

    Company(String name, String address, ProductionType productionType, List<Device> devices) {
        this.name = name;
        this.address = address;
        this.productionType = productionType;
        this.devices = devices;
    }

    public String getName() { return this.getClass().getSimpleName();}
    public String getAddress() { return address;}
    public ProductionType getProductionType() { return productionType;}
    public List<Device> getDevices() { return devices;}
}
