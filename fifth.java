//Q5. Find common elements between two arrays.
import java.util.*;
class fifth
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1"+" ");
        int n1=sc.nextInt();
        HashSet<Integer> set1 = new HashSet<Integer>();
        System.out.println("Enter the values");
        for(int i=0;i<n1;i++)
        {
            int a=sc.nextInt();
            set1.add(a);
        }

        System.out.print("Enter the value of n2"+" ");
        int n2=sc.nextInt();
        HashSet<Integer> set2 = new HashSet<Integer>();
        System.out.println("Enter the values");
        for(int i=0;i<n2;i++)
        {
            int a=sc.nextInt();
            set2.add(a);
        }

        set1.retainAll(set2);
        System.out.println("The common values are");
        System.out.println(set1);     //Output : [3, 4, 5]
    }
}