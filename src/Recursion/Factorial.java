package Recursion;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to find factorial : ");
        int a = sc.nextInt();
        sc.close();
        System.out.println("Factorial of " + a + " is " + (factorial(a)));
    }

    public static int factorial(int n)
    {
        if (n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }

}
