package lt.sda.javaFundamentalsCoding.senosUzduotys;

import java.util.Scanner;

public class uzduotis4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a positive number");

        int number = scanner.nextInt();
        int i;
        for(i=1; i<=number; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Fizz Buzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 7 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}
