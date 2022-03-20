package mosh.lerning;

class A
{
    String color="white";
}
class B extends A
{
    void printColor()
    {
        System.out.println(super.color);
    }
}
class C extends A
{
    void printColor()
    {
        System.out.println(super.color);
    }
}
class D extends B
{
    @Override
    void printColor()
    {
        System.out.println(super.color);
    }
}
public class Super_keyword_exp 
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.printColor();
        C c_obj = new C();
        c_obj.printColor();
        D d_obj = new D();
        d_obj.printColor();
    }
    
}
