package lt.sda.javaFundamentalsCoding;

import java.util.Scanner;

public class uzduotis9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int skaicius = scan.nextInt();
        if (skaicius <= 0) return;

        for (int row = 1; row <= 4; row++) {
            for (int i = 0; i < skaicius; i++) {
                for (int col = 1; col < skaicius; col++) {
                    if (row == col || col == skaicius * 2 - row) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}