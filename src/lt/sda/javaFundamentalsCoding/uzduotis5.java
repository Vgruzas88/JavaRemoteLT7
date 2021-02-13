package lt.sda.javaFundamentalsCoding;

import javax.swing.*;
import java.util.Scanner;

public class uzduotis5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a positive number");
        int input = scanner.nextInt();
        int i;
        System.out.println("All prime numbers up to " + input + " are: ");

        for(i=2; i<input; i++) {

            int j;

            for(j=2; j <= (i / 2); j++) {

                if(i % j == 0) {
                    j = i;
                    break;
                }
            }
            if(j != i) {
                System.out.println(i + " ");
            }
        }
    }
}
