package lt.sda.javaFundamentalsCoding.senosUzduotys;

import java.util.Scanner;

public class Uzduotis3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input a: ");
        int a = input.nextInt();

        System.out.println("Input b: ");
        int b = input.nextInt();

        System.out.println("Input c: ");
        int c = input.nextInt();

        int determinant = (b * b) / (4 * a * c);

        if (determinant < 0) {
            System.out.println("Delta negative exiting program");
            return;
        }
        else {
            double r1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double r2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("root1 = " + r1);
            System.out.println("root2 = " + r2);
            }
    }
}
