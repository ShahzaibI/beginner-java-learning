
package mosh.lerning;
public class typeCast_exp
{
    public static void main(String[] args) 
    {
        //Implicit casting mean automatic casting
        //byte > short > int > long
        short x=1;
        int y=x+2;
        System.out.println(y);
        //byte > short > int > long > float > double
        double i=1.1;
        double j = i+2;// 2 change in double data type automaticaly
        System.out.println(j);
        //Explicit casting
        double k = 1.1;
        int l = (int)k + 2;//explicit casting siraf unhi types par compatible
        //jo oper likhy han like byte > short > int > long > float > double
        System.out.println(l);
        String m = "1";
        int n = Integer.parseInt(m)+ 2;
        System.out.println(n);
        
        
        String o = "1.1";
        double p = Double.parseDouble(o)+2;
        System.out.println(p);
    }
}
