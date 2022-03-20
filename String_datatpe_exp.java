package mosh.lerning;
public class String_datatpe_exp
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        String message = "Hello word";
        System.out.println(message);
        System.out.println(message.endsWith("ord"));//check string end or spacific letters
        System.out.println(message.startsWith("H"));
        System.out.println(message.length());//to check lenghth of string
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("sky"));//show -1 because it is not part of string
        System.out.println(message.indexOf("e"));
        System.out.println(message.replace("Hello","hello" ));
        System.out.println(message);
        String str = "  Shahzaib  ";
        System.out.println(str.trim());//for remove extra spaces on biginning and ending
        //on the strin
        System.out.println(str);
    }
    
}
