import org.junit.Assert;
import org.junit.Test;
import turtles.pack.Turtles;

import static org.junit.Assert.*;

/**
 * Created by kristofer on 7/14/20.
 */
public class TurtlesTest {
    @Test
    public void testFactorial () {
        int expected = 120;
        int actual = Turtles.factorial(5);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public  void testGCD() {
        int expected = 5;
        int actual = Turtles.gcd(200,5);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public  void testGCD2() {
        int expected = 5;
        int actual = Turtles.gcd(200,5);
        Assert.assertEquals(expected,actual);
    }


}
