package lt.sda.javaFundamentalsCoding.advanced.collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        List<String> visitedCountries = new ArrayList<>();
        visitedCountries.add("Estonia");
        visitedCountries.add("Estonia");
        visitedCountries.add("Australia");
        visitedCountries.add("USA");
        visitedCountries.add("Ukraine");

        System.out.println("Original list");
        for (String country : visitedCountries) {
            System.out.println(country);
        }
        System.out.println("--------------");

        visitedCountries.remove("Estonia");
        System.out.println("Edited list");
        for (String country : visitedCountries) {
            System.out.println(country);
        }

        System.out.println(visitedCountries.contains("Australia"));
    }
}
