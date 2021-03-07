package lt.sda.javaFundamentalsCoding.senosUzduotys;

import java.util.Scanner;

public class uzduotis11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text: ");
        String text = scanner.nextLine();

        int i;
        String longestword = "";
        String[] strarray;
        String splitter = " ";
        strarray = text.split(splitter);

        if (!text.equals("") && !text.equals("Enough!")) {
            for (i = 0; i < strarray.length; i++) {
                if (strarray[i].equals("Enough!")) {
                    System.out.println("Longest text is " + longestword);
                }
                    else if (strarray[i].length() > longestword.length()) {
                    longestword = strarray[i];
                }
            }
        }

        else {
            System.out.println("No Text Provided");
        }
    }
}

