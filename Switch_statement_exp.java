package mosh.lerning;

import java.util.Scanner;
public class Switch_statement_exp 
{
    public static void main(String[] args) 
    {
        int day;
        Scanner in = new Scanner(System.in);
        
        boolean x=true;
        while(x==true)
        {
            System.out.print("Enter one day:");
            day=in.nextInt();
            switch(day)
            {
                case 1:
                    System.out.println("Monday");
                    x=false;
                    break;
                case 2:
                    System.out.println("Tusday");
                    x=false;
                    break;
                case 3:
                    System.out.println("Wednesday");
                    x=false;
                    break;
                case 4:
                    System.out.println("Thursday");
                    x=false;
                    break;
                case 5:
                    System.out.println("Friday");
                    x=false;
                    break;
                case 6:
                    System.out.println("Saturday");
                    x=false;
                    break;
                case 7:
                    System.out.println("Sunday");
                    x=false;
                    break;
                default:
                    System.out.println("You enter Wrong number please enter number in ranga 1 to 7");
            }
        }
    }
    
}
