package sorting;

import java.util.Scanner;

class Insertionsort
{
    public static void main(String[] args)
    {
        int[] a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        int n = sc.nextInt();
        a = new int[n];
        System.out.println("Enter array element");
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Array before sorting is [ ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.println("]");
        long starttime, endtime;
        double diff;
        starttime = System.currentTimeMillis();
        //Insertionsort obj = new Insertionsort();
        insertion obj = new insertion();
        int[] x = obj.insertionSort(a);
        endtime = System.currentTimeMillis();
        diff = (endtime - starttime) / 1000.0;
        System.out.println("Time Taken In Insertion sort is : " + diff);
        System.out.print("Array after sorting is [ ");
        for (int i = 0; i < x.length; i++)
        {
            System.out.print(x[i] + ", ");
        }
        System.out.print("]");
        sc.close();
    }

}
