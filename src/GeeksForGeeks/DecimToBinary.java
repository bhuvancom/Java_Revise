package GeeksForGeeks;

/**
 * created by Bhuvaneshvar on 13-09-2018
 **/
public class DecimToBinary
{
    public static void main(String[] args)
    {
        int a = 100;
        StringBuilder b = new StringBuilder();
        while (a != 0)
        {
            b.append(a % 2);
            a /= 2;
        }
        b.reverse();
        while (b.length() != 8)
        {
            b.insert(0, '0');
        }
        System.out.println(b);

        String one = b.substring(0, 4);
        String two = b.substring(4, b.length());
        System.out.println(one + " " + two);

        System.out.println(Integer.parseInt(two + one, 2));

    }
}
