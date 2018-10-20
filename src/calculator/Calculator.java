package calculator;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int i = 1, a, b, cal;
        Methods obj = new Methods();
        //System.out.println("Choose from following : \n 1 for sum \n 2 for substraction \n 3 for multiplication \n 4 for division \n 5 for modulo \n 6 for exit");
        while (i == 1)
        {
            System.out.println("Enter two number : ");
            a = sc.nextInt();
            System.out.println("Enter second number : ");
            b = sc.nextInt();
            System.out.println("Choose from following : \n press \n 1 for sum \n 2 for substraction \n 3 for multiplication \n 4 for division \n 5 for modulo \n 6 for exit");
            cal = sc.nextInt();
            switch (cal)
            {
                case 1:
                    obj.sum(a, b);
                    break;
                case 2:
                    obj.substraction(a, b);
                    break;
                case 3:
                    obj.multiplication(a, b);
                    break;
                case 4:
                    obj.division(a, b);
                    break;
                case 5:
                    obj.modulo(a, b);
                    break;
                case 6:
                    i = 0;
                    continue;
                default:
                    System.out.println("Choose valid option");

            }

        }
        sc.close();
    }

}