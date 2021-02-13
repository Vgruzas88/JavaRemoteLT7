package lt.sda.javaFundamentalsCoding;

import java.util.Scanner;

public class Uzduotis14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 lowercase letters from Latin alphabet");
        String text = scanner.nextLine();
        char char1 = text.charAt(0);
        char char2 = text.charAt(1);
        int num1 = char1;
        int num2 = char2;
        int gap;

        if(num1 < 97 || num1 >122) {
            System.out.println("Both characters must be lowercase Latin alphabet letters");
        }
        else if(num2 < 97 || num2 > 122) {
                System.out.println("Both characters must be lowercase Latin alphabet letters");
        }
        else {
            gap = num2 - num1;

            System.out.println("There are " + (Math.abs(gap)-1) + " Latin letters between " + char1 + " " + char2);
        }


    }
}
