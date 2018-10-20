package Recursion;

class RecursionTest
{
    // Find max value in an unsorted array of integer.
    public static int findMax(int[] A, int startIndex)
    {
        if (startIndex == A.length - 1)
        {
            return A[startIndex];
        }
        else
        {
            return Math.max(A[startIndex],
                    findMax(A, startIndex + 1));
        }
    }

    public static void main(String[] args)
    {
        int[] A = new int[5];
        A[0] = 3;
        A[1] = 37;
        A[2] = -5;
        A[3] = 12;
        A[4] = 7;
        System.out.println("Max = " + findMax(A, 0));
    }
}
