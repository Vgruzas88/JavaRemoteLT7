package basics;

import lt.sda.javaFundamentalsCoding.fundamentals_testing.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertSame;

public class AssertionExamples {


    @Test
    public void testAssertEquals() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(5, 85);

        // then
        assertEquals(90,result);
    }

    @Test
    public void testCalculatorSubtraction() {
        Calculator calculator = new Calculator();

        int result = calculator.subtract(80,20);

        assertEquals(60,result);
    }

    @Test
    public void testCalculatorMultiplication() {
        Calculator calculator = new Calculator();

        int result = calculator.multiplication(5,50);

        assertEquals(250,result);
    }

    @Test
    public void testCalculatorDivision() {
        Calculator calculator = new Calculator();

        int result = calculator.division(200,20);

        assertEquals(10,result);
    }
    @Test
    public void testAssertTrueFalse() {
        // given

        int firstNum = 5;
        int secondNum = 15;

        // when
        boolean condition = firstNum == secondNum;

        // then
        assertTrue(firstNum != secondNum);
        assertFalse(condition);
    }

    @Test
    public void testAssertNullOrNotNull() {
        // given
        String emptyTest = null;
        String text = "tekstas";

        // when

        // then
        assertNull(emptyTest);
        assertNotNull(text);
    }

    @Test
    public void testArrayEquals() {
        int[] firstArray = {1,2,3,4,5};
        int[] secondArray = {1,2,3,4,5};

        assertArrayEquals(firstArray,secondArray);
    }

    @Test
    public void testSameOrNotSame() {

        String text1 = "abc";
        String text2 = "abc";

        String text3 = new String("abc");

        assertSame(text1,text2);
        assertNotSame(text1,text3);


    }

}
