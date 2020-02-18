//Q8. Write a program to reverse a string and remove character from index 4 to index 9 from the reversed string using String Buffer
import java.util.*;
import java.lang.*;
public class eight {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your string"+" ");
        String s=sc.nextLine();
        StringBuffer str= new StringBuffer(s);
        str.reverse();
        str.delete(4,9);
        System.out.println("string after removing characters"+" "+str);
    }
}
