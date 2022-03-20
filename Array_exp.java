package mosh.lerning;

import java.util.Arrays;

public class Array_exp
{
    public static void main(String[] args) 
    {
        
        int [] number = new int[5];
        number[0]=1;
        number[1]=2;
        System.out.println(number);//show the address of array
        System.out.println(Arrays.toString(number));//show array in form of String
        int [][] num = new int [2][3];
        num[0][0]=1;
        System.out.println(Arrays.deepToString(num));//show multidimention array
        int [] array = { 5,3,4,6,2 };
        Arrays.sort(array);//for sort tha array
        System.out.println(Arrays.toString(array));
    }
    
}
