//Q2. Write a program to find the number of occurrences of the duplicate words in a string and print them ?
import java.util.*;
public class second {
    public static void main(String[] args)
    {
        int count;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        String words[] = s.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            count=1;
            for (int j = i + 1; j < words.length; j++)
            {
                if (words[i].equals(words[j]))
                {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }



    }
}
