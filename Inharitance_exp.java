package mosh.lerning;

class a
{
    int i=10;
    int j=20;
    void showij()
    {
        System.out.println("i="+i);
        System.out.println("j="+j);
    }
}
class b extends a
{
    int k=30;
    void showk()
    {
        System.out.println("k="+k);
    }
    void showijk()
    {
        System.out.println("i="+i);
        System.out.println("j="+j);
        System.out.println("k="+k);
    }
}
public class Inharitance_exp
{
    public static void main(String[] args)
    {
        a obj = new a();
        obj.showij();
        b obj1 = new b();
        obj1.showk();
        obj1.showijk();
    }
}