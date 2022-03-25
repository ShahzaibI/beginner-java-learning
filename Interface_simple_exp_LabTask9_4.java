package mosh.lerning;
interface Try
{
    int a = 10;
}
public class Interface_simple_exp_LabTask9_4 implements Try
{
    public static void main(String[] args)
    {
        //a=20;//compile time error because in interface 
        //all variale are final the do not change possible
        System.out.println(Try.a);
    }
}