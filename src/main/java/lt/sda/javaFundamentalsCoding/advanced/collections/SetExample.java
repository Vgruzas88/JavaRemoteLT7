package lt.sda.javaFundamentalsCoding.advanced.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> visitedCities = new HashSet<>();
        visitedCities.add("Kaunas");
        visitedCities.add("Vilnius");
        visitedCities.add("Klaipeda");
        visitedCities.add("Siauliai");
        visitedCities.add("Vilnius");
        visitedCities.add("Plunge");
        visitedCities.add("Rietavas");

        System.out.println("Original list");
        for (String cities : visitedCities) {
            System.out.println(cities);
        }

        System.out.println("--------------");

        System.out.println("Edited list");
        visitedCities.remove("Kaunas");
        visitedCities.remove("Marijampole");
        for (String cities : visitedCities) {
            System.out.println(cities);
        }

        System.out.println("--------------");

        if (!visitedCities.contains("Madrid")) {
            System.out.println("List does not contain Madrid");
        }

    }
}
