//Q1. Write a program to replace a substring inside a string with other string ?
import java.util.*;
import java.util.regex.Pattern;
public class one {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("Enter the substring to be replaced");
        String oldstr=sc.next();
        System.out.println("Enter the string to replace");
        String newstr=sc.next();
        System.out.println(str.replace(oldstr,newstr));


    }

}
