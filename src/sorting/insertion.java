package sorting;

public class insertion
{
    public int[] insertionSort(int[] a)
    {
        int i, key, j;
        for (i = 1; i < a.length; i++)
        {
            key = a[i];
            j = i - 1;
	 
	       /* Move elements of arr[0..i-1], that are
	          greater than key, to one position ahead
	          of their current position */
            while (j >= 0 && a[j] > key)
            {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
        return a;
    }

}
