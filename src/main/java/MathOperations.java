import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MathOperations {
    public static int subtraction(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    public static int multiplication(int multiplier, int multiplicand) {
        return multiplier * multiplicand;
    }

    // JUnit test for the subtraction method
    @Test
    public void testSubtraction() {
        int result1 = subtraction(10, 5);
        assertEquals("Subtraction Test 1 Failed", 5, result1);

        int result2 = subtraction(20, 7);
        assertEquals("Subtraction Test 2 Failed", 13, result2);
    }

    // JUnit test for the multiplication method
    @Test
    public void testMultiplication() {
        int result1 = multiplication(4, 6);
        assertEquals("Multiplication Test 1 Failed", 24, result1);

        int result2 = multiplication(-3, 8);
        assertEquals("Multiplication Test 2 Failed", -24, result2);
    }
}
