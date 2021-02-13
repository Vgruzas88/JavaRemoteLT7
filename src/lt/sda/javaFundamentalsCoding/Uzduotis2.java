package lt.sda.javaFundamentalsCoding;

import java.util.Scanner;

public class Uzduotis2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input your weight in kg: ");
        float weight = input.nextFloat();

        System.out.println("Input your height in cm: ");
        int height = input.nextInt();

        float BMI = weight / (height * height);

        if(BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Your BMI is Optimal");
        }
        else {
            System.out.println("Your BMI is not Optimal");
        }
    }
}
