package methodoverloading;

import java.util.Scanner;

public class Overloading
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Methods obj = new Methods();
        obj.Sum(a, b);
        System.out.println("Enter two float number");
        float y = sc.nextFloat();
        Float z = sc.nextFloat();
        obj.Sum(y, z);
        sc.close();
    }

}
