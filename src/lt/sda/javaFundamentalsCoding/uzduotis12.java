package lt.sda.javaFundamentalsCoding;

import java.util.Scanner;

public class uzduotis12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any kind of text");
        String text = scanner.nextLine();

        int count = 0;


        for(int i=0; i<text.length(); i++) {
            if(text.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Percentage of spaces in your text is: " + ((count * 100) / text.length()));
        //
    }
}