package mosh.lerning;

import java.util.Scanner;
abstract class figure//abstract class
{
    double length;
    Scanner sc =new Scanner(System.in);
    final double pi=3.142;
    figure(double a)
    {
        length = a;
    }
    abstract void area();//abstract method
}
class square extends figure
{
    square(double a)
    {
        super(a);
    }
    @Override
    void area()
    {
        System.out.print("Area of square: ");
        System.out.println(length*length);
    }   
}
class circle extends figure
{
    circle(double a)
    {
        super(a);
    }
    @Override
    void area()
    {
        System.out.print("Area of Circle: ");
        System.out.println(2*pi*length*length);
    }
}
class rectangle extends figure
{
    int w;
    rectangle(double a)
    {
        super(a);
        System.out.print("Enter width for rectangle:");
        w = sc.nextInt();
    }
    @Override
    void area()
    {
        System.out.print("Area of Rectangle: ");
        System.out.println(length*w);
    }
}
public class Abstraction_exp
{
    public static void main(String[] args)
    {
        circle obj = new circle(20.0);
        obj.area();
        square obj1 = new square(20.0);
        obj1.area();
        rectangle obj2 = new rectangle(20.0);
        obj2.area();
    }
}