package lt.sda.javaFundamentalsCoding.advanced.generics.generic_class.example1;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Car car = new Car(0);
        String text = "tekstas";
        int number = 60;

        GenericBox<Car> boxWithCarInIt = new GenericBox<>(car);
        GenericBox<String> boxWithText = new GenericBox<>(text);
        GenericBox<Integer> boxWithInt = new GenericBox<>(number);

        System.out.println(boxWithCarInIt.getItem());
        System.out.println(boxWithInt.getItem());

        GenericBox genericBox = new GenericBox();
        genericBox.setItem("sekmadienis");
        genericBox.setItem(new Car(4));
        genericBox.setItem(BigDecimal.ZERO);

        System.out.println(genericBox.getItem());
    }
}
