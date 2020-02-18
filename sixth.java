//Q6. There is an array with every element repeated twice except one. Find that element
import java.util.*;
public class sixth {
       public static void findUsingXOR(int [] a)
       {
        int xor = a[0];
        for (int i = 1; i <a.length ; i++) {
        xor ^= a[i];
        }
        System.out.println("Element appear only once in array - " + xor);
        }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        findUsingXOR(a);
        }
        }