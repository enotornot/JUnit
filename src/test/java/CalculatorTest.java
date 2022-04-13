import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    Calculator calculator = new Calculator();


    @Test(expected = ArithmeticException.class)
    public void testDivideByZeroShouldThrowArithmeticException() {
        calculator.divide(153.01, 0);
    }


    @Test(timeout = 1000)
    public void testTimeOfOperationsShouldBeLessThan1000ms() {
        calculator.subtraction(16.465, -4618);
    }


    @Test
    public void testMultiply() {
        double testMultiplyResult = calculator.multiply(15.00, 1);
        double expectedMultiplyResult = 15;

        Assert.assertEquals(testMultiplyResult, expectedMultiplyResult, 1e-5);
    }

}
