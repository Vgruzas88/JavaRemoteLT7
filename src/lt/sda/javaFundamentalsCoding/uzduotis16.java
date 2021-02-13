package lt.sda.javaFundamentalsCoding;

import java.util.Scanner;

public class uzduotis16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        System.out.println("Enter 10 numbers one by one: ");

        for(int i=0; i<10; i++) {
            array[i] = scanner.nextInt();
        }
        int currentstreak = 1;
        int biggestStreak = 1;

        for(int j=0; j < 9; j++){
            if(array[j] < array[j+1]) {
                currentstreak++;
                if (currentstreak > biggestStreak) {
                    biggestStreak = currentstreak;
                }
            }
            else {
                currentstreak =1;
            }
        }
        System.out.println("Your longest increasing sequences is "+biggestStreak);
    }
}
