package lt.sda.javaFundamentalsCoding.uzduotis20;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);

        boolean spejimas;

        do {
            System.out.println("Spek skaiciu nuo 0 iki 100");
            int vartSpejimas = scanner.nextInt();
            spejimas = ivertintiArTeisingasSpejimas(vartSpejimas, randomNumber);
        }
        while (!spejimas);
        }
        public static boolean ivertintiArTeisingasSpejimas(int vartSpejimas, int randomNumber) {
            if (vartSpejimas > randomNumber) {
                System.out.println("per didelis");
                return false;
            }
            if (vartSpejimas < randomNumber) {
                System.out.println("per mazas");
                return false;
            }
            System.out.println("Atspejai!!!");
            return true;
        }
        }

