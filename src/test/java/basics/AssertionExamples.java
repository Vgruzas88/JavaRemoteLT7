package basics;

import lt.sda.javaFundamentalsCoding.fundamentals_testing.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionExamples {


    @Test
    public void testAssertEquals() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(5, 85);

        // then
        Assertions.assertEquals(90,result);
    }

    @Test
    public void testCalculatorSubtraction() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(80,20);

        Assertions.assertEquals(60,result);
    }

    @Test
    public void testCalculatorMultiplication() {
        Calculator calculator = new Calculator();

        int result = calculator.multiplication(5,50);

        Assertions.assertEquals(250,result);
    }

    @Test
    public void testCalculatorDivision() {
        Calculator calculator = new Calculator();

        int result = calculator.division(200,20);

        Assertions.assertEquals(10,result);
    }
}
