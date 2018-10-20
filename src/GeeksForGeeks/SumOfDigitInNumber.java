package GeeksForGeeks;

/**
 * created by Bhuvaneshvar on 07-10-2018
 **/
public class SumOfDigitInNumber
{
    public static void main(String[] args)
    {
        int nm = 123;
        /**
         *  sum of { (1,2,3) (1,2) (1,3) (2,3) (1) (2) (3) }  -> 6 + 3 + 4 + 5 + 1 + 2 + 3   ->  24
         *
         **/
        long sum = 0;
        char arr[] = String.valueOf(nm).toCharArray();
        int len = arr.length;
        int arra[] = new int[len];
        for (int j = 0; j < len; j++)
            arra[j] = Integer.parseInt(String.valueOf(arr[j]));

        for (int i = 0; i < len - 1; i++)
        {
            for (int j = i + 1; j < len; j++)
            {
                sum += arra[j];
            }
            sum += arra[i];
        }

        System.out.println(sum);
    }
}
