package mosh.lerning;
import java.util.Scanner;
interface Addition
{
    int add(int number1,int number2);
}
interface Subtraction
{
    int sub(int number1,int number2);
}
interface Multiplication
{
    int mul(int number1,int number2);
}
interface Division
{
    int divide(int number1,int number2);
}
class calculation implements Addition,Subtraction,Multiplication,Division
{

    @Override
    public int add(int number1, int number2)
    {
        return number1+number2;
    }
    @Override
    public int sub(int number1, int number2)
    {
        return number1-number2;
    }
    @Override
    public int mul(int number1, int number2)
    {
        return number1*number2;
    }

    @Override
    public int divide(int number1, int number2)
    {
        return number1/number2;
    }
    
}
public class interfaces_exp_labtask9_6
{
    public static void main(String[] args)
    {
        calculation obj = new calculation();
        int number1,number2,result=0;
        char operator;
        boolean check = true;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        number1 = in.nextInt();
        System.out.print("Enter arithmetic operator: ");
        operator = in.next().charAt(0);
        System.out.print("Enter second number: ");
        number2 = in.nextInt();
        switch(operator)
        {
            case '+':
                result = obj.add(number1, number2);
                break;
            case '-':
                result = obj.sub(number1, number2);
                break;
            case '*':
                result = obj.mul(number1, number2);
                break;
            case '/':
                result = obj.divide(number1, number2);
                break;
            default:
                System.out.println("you enter wrong operator please enter correct arithmetic operator.");
                break;
        }
        System.out.println("Total result = "+result);
        for(int i=2;i<Math.sqrt(result);i++)
        {
            if(result%i==0)
            {
                check = false;
                break;
            }
        }
        if(check)
        {
            System.out.println("This result is a prime number");
        }
        else
        {
            System.out.println("This result is not a prime number");
        }
    }
    
}
