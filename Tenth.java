/*Q10.Write a single program for following operation using overloading
  A) Adding 2 integer number
  B) Adding 2 double
  C) multiplying 2 float
  D) multiplying 2 int
  E) concate 2 string
  F) Concate 3 String
* */
import java.util.*;
public class Tenth{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Tenth obj = new Tenth();
        System.out.println(Tenth.sum(10,20));
        System.out.println(Tenth.sum(10.02,20.02));
        System.out.println(Tenth.multiply(10,20));
        System.out.println(Tenth.multiply(10.02,20.02));
        System.out.println(Tenth.concatenate("neha","gupta"));
        System.out.println(Tenth.concatenate("neha","gupta","hiii"));
    }
    public static int sum(int a, int b)
    {
        return (a+b);
    }
    public static double sum(double a, double b)
    {
        return (a+b);
    }
    public static int multiply(int a,int b) {
        return (a * b);
    }
    public static double multiply(double a,double b) {
        return (a * b);
    }
    public static String concatenate(String a ,String b) {
        return a+b;
    }
    public static String concatenate(String a ,String b,String c) {
        return a+b+c;
    }

}
