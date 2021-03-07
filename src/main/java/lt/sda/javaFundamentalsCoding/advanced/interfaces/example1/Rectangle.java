package lt.sda.javaFundamentalsCoding.advanced.interfaces.example1;

public class Rectangle implements Shape {

    private double height;
   private double width;

   public Rectangle(double height, double width) {
       this.height = height;
       this.width = width;
   }

    @Override
    public double getShape() {
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (height * 2) + (width * 2);
    }
}
