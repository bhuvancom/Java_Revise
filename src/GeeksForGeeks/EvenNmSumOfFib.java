package GeeksForGeeks;

import java.util.Scanner;

/**
 * created by Bhuvaneshvar on 13-09-2018
 **/
public class EvenNmSumOfFib
{
    public static void main(String[] args)
    {
        //code
        Scanner sc = new Scanner(System.in);
        //(char)sc.next();
        sc.hasNext();
        String.valueOf(1).toLowerCase();
        //int T = 1;//sc.nextInt();
        //while(T>0)
        {
            int n = 692777;//sc.nextInt();
            long sum = 0;
            long pehla = 1, dusra = 1;
            for (int i = 2; i < n - 1; i++)
            {
                long j = pehla + dusra;
                pehla = dusra;
                dusra = j;

                if ((j % 2 == 0) && (j <= n))
                {
                    sum += j;
                }
                if (j > n) break;
                // System.out.println(sum);
            }
            System.out.println(sum);
            //  T--;
        }
    }
}
