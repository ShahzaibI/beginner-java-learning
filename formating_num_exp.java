package mosh.lerning;
import java.text.NumberFormat;
public class formating_num_exp
{
    public static void main(String[] args)
    {
        //NumberFormat obj = new NumberFormat();// object not ctreated
        //because it is absract class
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(123456.78);//return string value
        System.out.println(result);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.1);
        System.out.println(result1);
    }
    
}
