/**
 * Created with IntelliJ IDEA.
 * User: thinhdd
 * Date: 6/7/13
 * Time: 11:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringCalculator {
    public static int add(String s) {
        if(s.isEmpty())
            return 0;
        if (s.contains(","))
        {
            return Sum(s, ",");
        }
        return Integer.parseInt(s);  //To change body of created methods use File | Settings | File Templates.
    }
    public static int Sum(String s, String deli)
    {
        int sum=0;
        String cur[] = s.split(deli);
        for (String i: cur)
        {
            if(!i.isEmpty())
                sum=sum+Integer.parseInt(i);
        }
        return sum;
    }
}
