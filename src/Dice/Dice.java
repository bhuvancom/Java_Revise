package Dice;

import java.util.Scanner;

public class Dice
{
    public static void main(String[] args)
    {
        int i = 1, input, dice;
        Scanner sc = new Scanner(System.in);
        while (i == 1)
        {
            System.out.println("Press Any Number to start rolling Dice or Press key 1 to exit : ");
            input = sc.nextInt();
            if (input == 1)
            {
                i = 0;
                continue;
            }
            else
            {
                dice = (int) (Math.random() * 6) + 1;
                System.out.println("Face Value of Dice is : " + dice);
            }

        }
        sc.close();
    }
}
