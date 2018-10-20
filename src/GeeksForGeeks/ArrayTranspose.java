package GeeksForGeeks;

import java.util.Scanner;

/**
 * created by Bhuvaneshvar on 15-09-2018
 **/
public class ArrayTranspose
{
    public static void main(String[] args)
    {
        int n = 4;
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
