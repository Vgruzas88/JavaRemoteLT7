package lt.sda.javaFundamentalsCoding.namuDarbai_02_20.uzduotis_02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Circle circle = new Circle("Circle",5);
        RightAngleTriangle rightAngleTriangle = new RightAngleTriangle("RightAngleTriangle",4,5);
        Rectangle rectangle = new Rectangle("Rectangle",8,10);

        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(rightAngleTriangle.getArea());
        System.out.println(rectangle.getArea());

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\vgruz\\IdeaProjects\\JavaFundamentalsCoding\\src\\lt\\sda\\javaFundamentalsCoding\\namuDarbai_02_20\\uzduotis_02\\Infofile.txt"))) {
            bufferedWriter.write(circle.getArea()+ "\n");
            bufferedWriter.write(circle.getPerimeter()+ "\n");
            bufferedWriter.write(rightAngleTriangle.getArea()+ "\n");
            bufferedWriter.write(rectangle.getArea()+ "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
