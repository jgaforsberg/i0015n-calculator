import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CalculatorTest {

/*
        Run either from this class or from testng.xml file

        No intended bugs present in main code or test code
 */

    @Test(priority = 1)
    void add() {
        Assert.assertEquals(Calculator.add(5,5), 10.0);
        System.out.println("\tTest addition");
    }
    @Test(priority = 2)
    void subtract()    {
        Assert.assertEquals(Calculator.subtract(5,5), 0.0);
        System.out.println("\tTest subtraction");
    }
    @Test(priority = 3)
    void multiply() {
        Assert.assertEquals(Calculator.multiply(5,5),25.0);
        System.out.println("\tTest multiplication");
    }
    @Test(priority = 4)
    void divide()   {
        Assert.assertNotEquals(Calculator.divide(25,10), 5.0);
        System.out.println("\tTest division");
    }
    @BeforeTest
    void init() {System.out.println("Initializing test...\n");}
    @AfterTest
    void close()    {
        System.out.println("\nTest finished...");
    }

}
