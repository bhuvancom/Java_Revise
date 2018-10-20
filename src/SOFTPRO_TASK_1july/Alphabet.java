package SOFTPRO_TASK_1july;

import java.util.Scanner;

public class Alphabet
{
    public static void main(String[] args)
    {
        Alphabet alphabet = new Alphabet();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name - ");
        String name = scanner.nextLine().toUpperCase().trim();
        alphabet.getdata(name);

    }

    public void getdata(String string)
    {
        int sum = 0;
        for (char ch : string.toCharArray())
        {
            if (ch >= 'A' && ch <= 'Z')
            {
                sum += 1 + ch - 'A';
            }
        }
        System.out.println("The sum of " + string + " is " + sum);
    }
}
