package lt.sda.javaFundamentalsCoding;

import java.util.Scanner;

public class uzduotis10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive number: ");
        int input = scanner.nextInt();
        int sum = 0;

        while (input != 0) {
            sum = sum + input % 10;
            input = input / 10;
        }
        System.out.println("Sum of all digits: " +sum);

    }
}
