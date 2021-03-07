package lt.sda.javaFundamentalsCoding.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tom", "John", "Ben", "Brad");

        // Isspausdinti vardus, kurie prasideda raide B
        names.stream()
                .filter(name -> name.startsWith("B"))
                .forEach(name -> System.out.println(name));

        // Paversti vardu sarasa i ju simboliu skaiciu
        List<Integer> nameLengths = names.stream()
                .map(name -> name.length())
                .filter(length -> length > 3)
                .map(number -> number * 10)
                .collect(Collectors.toList());
        System.out.println(nameLengths);


    }
}
