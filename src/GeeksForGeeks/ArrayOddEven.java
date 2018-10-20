package GeeksForGeeks;

import java.util.ArrayList;
import java.util.Collections;

/**
 * created by Bhuvaneshvar on 15-09-2018
 **/
public class ArrayOddEven
{
    public static void main(String[] args)
    {
        // sort given array such that first part of array contain odds
        // with descending order and rest even with ascending order
        int n = 7;
        int arr[] = {1, 2, 3, 5, 4, 7, 10};
        //answer is {7,5,3,1,2,4,10}
        ArrayList<Integer> alO = new ArrayList<>();
        ArrayList<Integer> alE = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            if (arr[i] % 2 == 0)
                alE.add(arr[i]);
            else
                alO.add(arr[i]);
        }
        alE.sort(null);
        alO.sort(Collections.reverseOrder());
        for (int i : alE
                )
        {
            System.out.print(i + " ");
        }
        // int ar[] = new int[alO.size()];
        //int ar[] = alO.toArray();

        for (int i : alO)
            System.out.print(i + " ");
    }
}
