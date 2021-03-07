package lt.sda.javaFundamentalsCoding.advanced.streams;

import java.util.Arrays;
import java.util.List;

public class MatchExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tom", "John", "Ben");

        // Ar yra bent vienas vardas, kurio ilgis yra daugiau nei 3 simboliai.

        /*boolean isThereALNameLonger3 = false;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 3) {
                isThereALNameLonger3 = true;
                break;
            }
        }*/
        boolean isThereALNameLonger3 = names.stream()
                .anyMatch(name ->name.length() > 3);
        System.out.println("Ar yra bent vienas vardas, kurio ilgis yra daugiau nei 3 simboliai? " + isThereALNameLonger3);


        // Ar visu vardu ilgiai yra < 3
        /*boolean areAllNamesLonger3 = false;
        int counter = 0;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() > 3) {
                counter++;
            }
        }
        if (counter == names.size()) {
            areAllNamesLonger3 = true;
        }*/

        boolean areAllNamesLonger3 = names.stream()
                .allMatch(name -> name.length() > 3);
        System.out.println("Ar visu vardu ilgiai yra < 3? " + areAllNamesLonger3);
    }
}