package lt.sda.javaFundamentalsCoding.senosUzduotys;

import java.util.Scanner;

public class uzduotis15 {
    public static void main(String[] args) {


        int n = 10;
        int[] input = new int[n];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your numbers: ");

        for(int i=0; i<n; i++) {
            input[i] = scanner.nextInt();
        }
        System.out.println("Duplicates are: ");
        for (int i = 0; i < n; i++) {
            for(int j = i+1; j< input.length; j++) {
                if(input[i] == input[j])
                    System.out.println(input[j]);
            }

        }
    }
}
