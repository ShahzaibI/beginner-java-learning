package mosh.lerning;
import java.lang.Math;
public class math_class_exp
{
    public static void main(String[] args)
    {
        int result = Math.round(1.5F);
        System.out.println(result);
        int result1 = (int)Math.ceil(1.1F);
        System.out.println(result1);
        int result2 = (int)Math.floor(1.5f);
        System.out.println(result2);
        int result3  = Math.max(1, 2);
        System.out.println(result3);
        double result4 = Math.random();
        System.out.println(result4);
        double result5 = Math.random()*100;
        System.out.println(result5);
        double result6 = Math.round(Math.random()*100);
        System.out.println(result6);
        int result7 = (int)Math.round(Math.random()*100);
        System.out.println(result7);
        int result8 = (int)(Math.random()*100);
        System.out.println(result8);
        double result9 = Math.pow(5, 5);
        System.out.println(result9);
    }
    
}
