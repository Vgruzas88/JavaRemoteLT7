package lt.sda.javaFundamentalsCoding.advanced.generics.generic_interface;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(220);
        Car car2 = new Car(150);

        if (car1.compareTo(car2) > 0) {
            System.out.println("car1 is faster");

        }
    }
}
