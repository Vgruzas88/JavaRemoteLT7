package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_04;


import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Device phones = new Device("Phones", 900, 10,"Device to call someone");
        Device tablets = new Device("Tablets", 1200, 15,"Device to use as POS");
        Device screwDrivers = new Device("ScrewDrivers", 10, 3,"Device to fix something");
        Device disposableBoxes = new Device("DisposableBoxes", 20, 100,"Device to put food into");
        Device computers = new Device("Computers", 1000, 2,"Device to operate business");

        List<Device> devices = new ArrayList<>();
        devices.add(phones);
        devices.add(tablets);
        devices.add(screwDrivers);
        devices.add(disposableBoxes);
        devices.add(computers);

        Company company1 = new Company("Kompanija1","Gedimino g. 1", ProductionType.TECHNOLOGIES, Arrays.asList(phones, tablets, computers));
        Company company2 = new Company("Kompanija2","Gedimino g. 2", ProductionType.AUTOMOBILES, Arrays.asList(phones, computers));
        Company company3 = new Company("Kompanija3","Gedimino g. 3", ProductionType.FOOD, Arrays.asList(disposableBoxes, phones));
        Company company4 = new Company("Kompanija4","Gedimino g. 4", ProductionType.GARDEN_TOOLS, Arrays.asList(disposableBoxes,tablets,screwDrivers));
        Company company5 = new Company("Kompanija5","Gedimino g. 5", ProductionType.TECHNOLOGIES, Arrays.asList(computers,phones,tablets,disposableBoxes));

        List<Company> companies = new ArrayList<>();
        companies.add(company1);
        companies.add(company2);
        companies.add(company3);
        companies.add(company4);
        companies.add(company5);

//        getMostExpensiveDevice(companies);
//        getTechnologyCompanies(companies);

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\vgruz\\IdeaProjects\\JavaFundamentalsCoding\\src\\lt\\sda\\javaFundamentalsCoding\\namuDarbai_02_20\\uzduotis_04\\results.txt"))) {
            bufferedWriter.write(getMostExpensiveDevice(companies));
            bufferedWriter.write(getTechnologyCompanies(companies));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getMostExpensiveDevice(List<Company> companies) {
        StringBuilder mostExpensiveDeviceText = new StringBuilder();
        for (Company company : companies) {
            Device mostExpensiveDevice = new Device("test", 0, 1, "a");
            for (Device device : company.devices) {
                if (mostExpensiveDevice.getPrice() < device.getPrice()) {
                    mostExpensiveDevice = device;
                }
            }
            mostExpensiveDeviceText.append(company.name + " most expensive device is: " + mostExpensiveDevice.getName());
            mostExpensiveDeviceText.append("\n");
            System.out.println(company.name + " most expensive device is: " + mostExpensiveDevice.getName());
        }
        return String.valueOf(mostExpensiveDeviceText);
    }
    public static String getTechnologyCompanies(List<Company> companies) {
        StringBuilder technologyCompaniesText = new StringBuilder();
        technologyCompaniesText.append("Technology companies are: \n");
        for (Company company : companies) {
                if (company.getProductionType() == ProductionType.TECHNOLOGIES) {
                    System.out.println(company.name);
                    technologyCompaniesText.append(company.name);
                    technologyCompaniesText.append("\n");
                }
            }
        return String.valueOf(technologyCompaniesText);
    }
}


