//Q4. Calculate the number & Percentage Of Lowercase Letters,Uppercase Letters, Digits And Other Special Characters In A String
import java.util.*;
public class four {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        characterPercentage(s);
    }
    static void characterPercentage(String str)
    {
        int len=str.length();
        int small=0;
        int capital=0;
        int digit=0;
        int  special=0;
        int space=0;
        for(int i=0;i<len;i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)==true)
                capital++;
            else if(Character.isLowerCase(ch)==true)
                small++;
            else if(Character.isDigit(ch)==true)
                digit++;
            else if(Character.isWhitespace(ch)==true)
                space++;
            else
                special++;
        }
        //System.out.println(capital+" "+small+" "+digit+" "+space+" "+special +" " +len);
        double upperCaseLetterPercentage = (capital * 100.0) /len;
        double lowerCaseLetterPercentage = (small * 100.0) / len;
        double digitsPercentage = (digit * 100.0) / len;
        double otherCharPercentage = (special * 100.0) /len;
        System.out.print("Percentage of Uppercase letter"+" ");
        System.out.format("%.2f", upperCaseLetterPercentage);
        System.out.println();
        System.out.print("Percentage of Lowercase letter"+" ");
        System.out.format("%.2f", lowerCaseLetterPercentage);
        System.out.println();
        System.out.print("Percentage of Digits"+" ");
        System.out.format("%.2f", digitsPercentage);
        System.out.println();

        System.out.print("Percentage of Special Characters"+" ");
        System.out.format("%.2f", otherCharPercentage);
        System.out.println();

    }
}
