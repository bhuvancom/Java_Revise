package GeeksForGeeks;

/**
 * created by Bhuvaneshvar on 14-09-2018
 **/
public class MakeItPalindrome
{
    public static void main(String[] args)
    {
        int nm = 265;
        //System.out.println(revOfNm(nm));
        int rev = 0;
        for (int i = 1; i < 7; i++)
        {
            if (isPalindrome(nm) || i == 6)
            {
                rev = nm;
                break;
            }
            rev = revOfNm(nm);
            rev += nm;
            nm = rev;
            System.out.println(i + "   and " + nm);


        }

        if (isPalindrome(rev))
            System.out.println(rev);
        else
            System.out.println("-1");


    }

    static boolean isPalindrome(int nm)
    {
        int org = nm;
        int rev = 0;
        while (nm != 0)
        {
            rev = (rev * 10) + (nm % 10);
            nm /= 10;
        }

        //return rev;
        return org == rev;

    }

    static int revOfNm(int nm)
    {
        int newNm = 0;
        while (nm != 0)
        {
            newNm = (newNm * 10) + (nm % 10);
            nm /= 10;
        }
        return newNm;
    }
}
