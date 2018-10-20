package primes;


import java.util.Scanner;

public class PrimeCheching
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nmbr to check prime\n");
        int nmbr = sc.nextInt();
        boolean isPrime = checkPrime(nmbr);
        if (isPrime)
            System.out.printf("%d is prime%n\n", nmbr);
        else
            System.out.printf("%d is not prime %n\n", nmbr);

        System.out.println("enter start limit\n");
        long start = sc.nextLong();
        System.out.println("enter end limit\n");
        long last = sc.nextLong();
        for (long i = start; i <= last; i++)
        {
            if (checkPrime(i))
            {
                System.out.print(i + "\t");
            }
        }
    }


    private static boolean checkPrime(long nmbr)
    {


        if ((nmbr == 2) || nmbr == 3)
        {
            return true;

        }
        if (nmbr % 2 == 0 || nmbr % 3 == 0 || nmbr == 1)
        {
            return false;
        }
        long checkTill = (long) Math.sqrt(nmbr);
        for (int i = 3; i < checkTill; i += 2)
        {
            if (nmbr % i == 0 || nmbr % checkTill == 0)
            {
                return false;
                //break;
            }
        }
        return true;
    }
}
