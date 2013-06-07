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
    @Test
    public void testOneN()
    {
        Assert.assertEquals(StringCalculator.add("1"),1);
    }
    @Test
    public void testOneDe()
    {
        Assert.assertEquals(StringCalculator.add("1,2"),3);
    }
    @Test
    public void testTwoDe()
    {
        Assert.assertEquals(StringCalculator.add("1,2\n3"),6);
    }
}
