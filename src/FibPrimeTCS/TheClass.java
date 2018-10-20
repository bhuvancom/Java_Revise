package FibPrimeTCS;

/**
 * created by Bhuvaneshvar on 26-08-2018
 **/
public class TheClass
{
    public static void main(String[] args)
    {
        getSeries(100);
    }

    private static void getSeries(int n)
    {
        //code
        int i = 2, j = 1, k, l, count = 0;
        int[] a = new int[n + 1];
        a[0] = 0;
        a[1] = 1;
        System.out.print(a[1] + " ");
        while (i <= n)
        {
            if (i % 2 == 0)
            {
                l = i;
                do
                {
                    j++;
                    for (k = 2; k < j; k++)
                    {
                        if (j % k == 0)
                            count++;
                    }
                    if (count == 0)
                    {
                        a[i] = j;
                        System.out.print(a[i] + " ");
                        i++;

                        break;
                    }
                    count = 0;
                } while (l == i);
            }
            else
            {
                if (i == 3)
                    a[i] = a[i - 2] + a[0];
                else
                    a[i] = a[i - 2] + a[i - 4];
                System.out.print(a[i] + " ");
                i++;
            }
        }
        System.out.println();

        System.out.printf("%d", a[n]);
    }
}
