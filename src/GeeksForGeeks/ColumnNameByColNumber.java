package GeeksForGeeks;

/**
 * created by Bhuvaneshvar on 13-09-2018
 **/
public class ColumnNameByColNumber
{
    public static void main(String[] args)
    {
        int n = 105;
        System.out.println(getString("", n));

    }

    public static String getString(String s, long n)
    {
        if (n <= 26)
        {
            return ((char) (n + 65 - 1) + s);
        }
        long temp = 26 - n % 26;
        if (temp != 26)
        {
            s = (char) (90 - temp) + s;
            n -= (26 - temp);
        }
        else
        {
            s = (char) (65 + temp - 1) + s;
            n -= temp;
        }
        n /= 26;

        return getString(s, n);
    }
}
