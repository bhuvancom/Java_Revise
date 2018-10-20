package GeeksForGeeks;

/**
 * created by Bhuvaneshvar on 14-09-2018
 **/
public class RemoveLargeAndSecondLargeFromArray
{
    public static void main(String[] args)
    {
        //  int arr[] = {927 ,282 ,546 ,930 ,68 ,371 ,531 ,124 ,363 ,328 ,435 ,422 ,70 ,43 ,199 ,803 ,369 ,387 ,815 ,368 ,85 ,28 ,887 ,171 ,212 ,789 ,568 ,874 ,230 ,926 ,336 ,60 ,541 ,764 ,997 ,430 ,847 ,957 ,59, 493 ,125 ,920, 88, 168 ,427 ,374 ,314 ,306 ,538 ,457 ,12, 751 ,858 ,863 ,325 ,527 ,92 ,737 ,916 ,136 ,337 ,730 ,981 ,277 ,896 ,414 ,179 ,778 ,691 ,44 ,316 ,365, 583 ,783 ,173 ,785 ,506 ,794 ,650 ,394 ,23 ,809};
        int arr[] = {229, 366, 988, 475, 228, 433, 744, 408, 438, 276, 857, 492, 860, 937, 552};
        int n = arr.length;
//        int largest = arr[0];
//        int secondLargest = arr[0];
//        int ar2r[] = new int[n-2];
//        for(int i =0;i<n;i++)
//        {
//            if (arr[i] > largest)
//            {
//                secondLargest = largest;
//                largest = arr[i];
//
//            }
//            else if (arr[i] > secondLargest) {
//                secondLargest = arr[i];
//            }
//        }
        // System.out.println(largest + " <- largest and second large ->" + secondLargest);
        for (int i = 1; i < n; i++)
        {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        for (int i = 0; i < arr.length - 2; i++)
        {
            System.out.print(arr[i] + "\t");
        }


    }
}
