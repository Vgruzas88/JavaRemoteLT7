package lt.sda.javaFundamentalsCoding;

import java.util.Scanner;

public class uzduotis18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String sneezeRegex = "(?i)acho{1,}!";
        if(text.matches(sneezeRegex)){
            System.out.println("Bless you!");
        }
    }
}
