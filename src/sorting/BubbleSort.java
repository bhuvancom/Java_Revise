package sorting;

/**
 * created by Bhuvaneshvar on 10-10-2018
 **/
public abstract class BubbleSort
{
    public static void main(String[] args)
    {
        int arr[] = new int[10000];

        for (int i = 0; i < arr.length; i++)
            arr[i] = i;
        //BubbleSort bubbleSort = new BubbleSort();

        long crnt = System.currentTimeMillis();
        BubbleSort.bubbleSort(arr);
        //BubbleSort.bubleSort(arr);
        long after = System.currentTimeMillis();

        System.out.println("time taken -> " + (after - crnt) / 1000.0);

        for (int i : arr)
            System.out.print(i + " ");

    }

    private static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    abstract void swap(int a, int b);
}
