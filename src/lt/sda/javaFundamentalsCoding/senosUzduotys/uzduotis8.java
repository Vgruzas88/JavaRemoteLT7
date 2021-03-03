package lt.sda.javaFundamentalsCoding.senosUzduotys;

import java.util.Scanner;

public class uzduotis8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float float1 = scanner.nextFloat();

        System.out.println("Enter mathematical operator like + - * / : ");

        char operator = scanner.next().charAt(0);

        System.out.println("Enter second number: ");
        float float2 = scanner.nextFloat();

        switch (operator) {

            case '+':
                System.out.println(float1 + float2);
                break;

            case '-':
                System.out.println(float1 - float2);
                break;

            case '*':
                System.out.println(float1 * float2);
                break;

            case '/':
                if (float2 == 0 && float1 == 0); {
                System.out.println("Cannot calculate");
            }
            System.out.println(float1 / float2);
                break;

            default:
                System.out.println("Invalid symbol");
        }


    }
}
