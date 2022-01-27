import izaan.class_110.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
       int actualResult = Calculator.add(2,2);
       int expectedResult = 4;
        // Compare actualResult with expectedResult
        // Same or Not Same  -> True or False
        Assert.assertEquals(actualResult, expectedResult); // False
        System.out.println("Test Passed");
    }

    @Test
    public void divisionTest(){
        int actualResult = Calculator.division(2,2);
        int expectedResult = 1;
        // Compare actualResult with expectedResult
        // Same or Not Same  -> True or False
        Assert.assertEquals(actualResult, expectedResult); // False
        System.out.println("Test Passed");
    }
}
