package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_06;

public class Main {

    public static void main(String[] args) {

        House[] houses = new House[3];
        houses[0] = new House(300, "Šimšė", 1982, "fitted");
        houses[1] = new House(585, "Pietinis", 2008, "finished");
        houses[2] = new House(212, "Senamiestis", 1996, "partially");


        System.out.println(getNewestHouse(houses));
        getFittedHouses(houses);
        System.out.println(getSmallestHouse(houses));
    }

    public static String getNewestHouse(House[] houses) {
        int newestHouseAge = 0;
        String newestHouse = null;
        for (House house : houses) {
            if(newestHouseAge < house.getBuiltYear()) {
                newestHouseAge = house.getBuiltYear();
                newestHouse = house.toString();
            }
        }
        return "Newest house is " + "\n" + newestHouse;
    }

    public static void getFittedHouses(House[] houses) {
        System.out.println("Fitted houses are: ");
        for (House house : houses) {
            if(house.getCondition().equalsIgnoreCase("fitted")) {
                System.out.println(house.toString());
            }
        }
    }

    public static String getSmallestHouse(House[] houses) {
        double smallestArea = 999999;
        String smallestHouse = null;
        for(House house : houses) {
            if(house.getHouseArea() < smallestArea) {
                smallestArea = house.getHouseArea();
                smallestHouse = house.toString();
            }
        }
        return "Smallest house is: " +"\n" + smallestHouse;
    }
}

