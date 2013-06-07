import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
    @Test
    public void testErrorTwo()
    {
        Assert.assertEquals(StringCalculator.add("1,\n2"),-1);
    }
    @Test
    public void testOneSpecDel()
    {
        Assert.assertEquals(StringCalculator.add("//;\n1;2;3"),6);
    }
    @Rule
    public ExpectedException ex = ExpectedException.none();
    @Test
    public void testNegaNum()
    {
        ex.expectMessage("-1 -2 ");
        Assert.assertEquals(StringCalculator.add("-1,-2,3"),-1);
    }
    @Test
    public void testBigNum()
    {
        Assert.assertEquals(StringCalculator.add("1000,2"),2);
    }
    @Test
    public void testStringDeli()
    {
        Assert.assertEquals(StringCalculator.add("//[***]\n1***2***3"),6);
    }
    @Test
    public void testMutiOneDeli()
    {
        Assert.assertEquals(StringCalculator.add("//[*][%]\n1*2%3"),6);
    }
}
