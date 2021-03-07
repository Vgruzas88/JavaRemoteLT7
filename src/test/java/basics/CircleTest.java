package basics;

import lt.sda.javaFundamentalsCoding.fundamentals_testing.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    @Test
    public void calculateCirclePerimeterTest() {
        Circle circle = new Circle(10);

        int result = circle.calculateCircleLength();

        Assertions.assertEquals(62, result);
    }

    @Test
    public void calculateCircleArea() {
        Circle circle = new Circle(10);

        int result = circle.calculateCirleArea();

        Assertions.assertEquals(314,result);
    }
}
