import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/7/13
 * Time: 11:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculatorTest {
    @Test
    public void testEmpty()
    {
        Assert.assertEquals(StringCalculator.add(""), 0);
    }
}
