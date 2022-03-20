package mosh.lerning;

import java.io.*;
class emp
{
    int eid;
    int salary;
    static final String ceo;
    emp()
    {
        eid=1;
        salary=5000;
    }
    static
    {
        ceo="ABC";
    }
}
public class static_block_exp 
{
    public static void main(String[] args)
    {
        emp obj = new emp();
        System.out.println(obj.eid);
        System.out.println(obj.salary);
        System.out.println(obj.ceo);
        System.out.println(emp.ceo);
    }
    
}
