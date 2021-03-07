package lt.sda.javaFundamentalsCoding.advanced.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

        // "Tom : Brandon : Micheal"

        String text = names.stream()
                .reduce("",
                        (currentValue, element) -> (currentValue.isEmpty() ? "" : currentValue + ": ") + element);
        System.out.println(text);

        // text pirmos interacijos reiksme = "",
        // current value 1 iteracijos metu irgi = "",
        // element = pirma sarase esanti reiksme ="Tom"

        // reduce(pradine reiksme, (sumine/tarpine reiksme, iteruojama reiksme))

        int num = names.stream()
                .map(name -> name.length())
                .reduce(0,
                        (currentSum, number) -> (number > 3 ? 1 : 0) + currentSum
                );
        System.out.println(num);

        List<String> zodziai = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");

        String allWordsInOne = zodziai.stream()
                .reduce("",
                        (currentWordSum, word) -> currentWordSum + word
                );
        System.out.println(allWordsInOne);

        String allWordsInOneCaps = zodziai.stream()
                .map(zodis -> zodis.toUpperCase())
                .reduce("",
                        (currentWordSum, word) -> currentWordSum + word
                );
        System.out.println(allWordsInOneCaps);

        String allWordsWithSeparator = zodziai.stream()
                .filter(word -> word.length() > 5)
                .reduce("",
                        (currentWordSum, word) -> (currentWordSum.isEmpty() ? "" : currentWordSum + ",") + word
                );
        System.out.println(allWordsWithSeparator);

//        String noLetterOWords = zodziai.stream()
//                .filter(word -> word.contains("o")
//                .reduce("",
//                        (currentWordSum, word) -> currentWordSum + " " + word
//                );

    }
}
