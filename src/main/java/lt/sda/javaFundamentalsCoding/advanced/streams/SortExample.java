package lt.sda.javaFundamentalsCoding.advanced.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tom", "John", "Ben", "Brad");

        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());

        List<String> sortedNamesInReverseOrder = names.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(names);
        System.out.println(sortedNames);
        System.out.println(sortedNamesInReverseOrder);
    }
}
