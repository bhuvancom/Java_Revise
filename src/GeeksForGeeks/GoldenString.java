package GeeksForGeeks;

/**
 * created by Bhuvaneshvar on 11-09-2018
 **/

import java.util.Scanner;

public class GoldenString
{


    public static void main(String[] args)
    {
        //code
        Scanner sc = new Scanner(System.in);
        int T = 1;//sc.nextInt();
        while (T > 0)
        {
            String str = "code";//sc.nextLine();
            int con = 0, vov = 0;
            for (int i = 0; i < str.length(); i++)
            {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'A' || ch == 'E' || ch == 'e' || ch == 'i' || ch == 'I' || ch == 'o'
                        || ch == 'O' || ch == 'u' || ch == 'U')
                {
                    vov++;
                }
                else
                    con++;
            }
            if (con == vov)
                System.out.println("YES");
            else
                System.out.println("NO");

            T--;
        }
    }
}
