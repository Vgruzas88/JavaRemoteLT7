package lt.sda.javaFundamentalsCoding.senosUzduotys;

import java.util.Scanner;

public class IndividualiosUzduotys1 {

    public static void main(String[] args) {

        float PI = 3.14f;

        Scanner input = new Scanner(System.in);

        System.out.println("Input circle diameter");
        float diameter = input.nextFloat();

        System.out.println("Circle perimeter is " + PI * diameter);
        System.out.println("Circle perimeter is " + Math.PI * diameter);
    }
}