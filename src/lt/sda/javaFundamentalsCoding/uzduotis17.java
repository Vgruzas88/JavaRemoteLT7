package lt.sda.javaFundamentalsCoding;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class uzduotis17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter SDA course date in yyyy-mm-dd format: ");
        String coursedate = scanner.nextLine();

        LocalDate dateOfCourse = LocalDate.parse(coursedate);
        LocalDate currentDate = LocalDate.now();

        System.out.println(ChronoUnit.DAYS.between(currentDate, dateOfCourse));

    }
}
