package lt.sda.javaFundamentalsCoding;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class uzduotis13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your text here");
        String text = scanner.nextLine();

        String[] strarray;
        String splitter = " ";

        strarray = text.split(splitter);

        for(int i=0; i<strarray.length; i++) {
            System.out.print(strarray[i] +" "+strarray[i]+" ");
        }
    }
}
