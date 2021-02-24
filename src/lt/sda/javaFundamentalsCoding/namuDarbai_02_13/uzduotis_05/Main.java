package lt.sda.javaFundamentalsCoding.namuDarbai_02_13.uzduotis_05;

import java.awt.image.CropImageFilter;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(14.14,"Red");

        System.out.println("Circle color is: "+ circle.getColor());
        System.out.println("Circle area is: " + Math.PI * (circle.getRadius()* circle.getRadius()));
        System.out.println("Circle length is: " + Math.PI  * (2 * circle.getRadius()));
        }




    }

