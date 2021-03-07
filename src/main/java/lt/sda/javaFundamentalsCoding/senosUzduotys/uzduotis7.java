package lt.sda.javaFundamentalsCoding.senosUzduotys;

import java.util.Scanner;

public class uzduotis7 {

    public static void main(String[] args) {

        int input, n3,n1 = 0,n2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive number");
        input = scanner.nextInt();

        if(input<=1)
            System.out.println(input);

        for(int i=2; i<=input; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        System.out.println(n2);
    }
}
