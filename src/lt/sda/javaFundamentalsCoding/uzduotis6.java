package lt.sda.javaFundamentalsCoding;

import java.util.Scanner;

    public class uzduotis6 {

      public static void main(String[] args) {

          double i;
          double sum = 0;
          Scanner scanner = new Scanner(System.in);

          System.out.println("Input a positive number");

          double input = scanner.nextInt();

          for (i = 1; i <= input; i++) {

              sum = sum + (1 / i);
          }
          System.out.println("Sum of Harmonic value = " + sum);
      }
}
