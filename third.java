//Q3. Write a program to find the number of occurrences of a character in a string without using loop?
import java.util.*;
public class third {
public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        String ch = sc.nextLine();
        int ans=s.length()-s.replace(ch,"").length();
        System.out.println(ch+" occurs "+ans+" times ");
    }

}
