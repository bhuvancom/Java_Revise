package String;

import java.util.Scanner;

class Stringoperation
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String :");

        String var1 = sc.next();

        System.out.print("Initial given string is : " + var1 + "\n");

        System.out.println("Size of the string is : " + (var1.length()));

        System.out.print("Enter Second String : ");

        String var2 = sc.next();

        System.out.println("Size of Second String Is : " + (var2.length()));

        System.out.println("first String Char Stream : ");

        for (int i = 0; i < var1.length(); i++)
        {
            System.out.println("\t" + var1.charAt(i));
        }

        System.out.println("Second String Char Stream : ");

        for (int i = 0; i < var2.length(); i++)
        {
            System.out.println("\t" + var2.charAt(i));
        }

        System.out.println("Substring of first String from middle to last is : " + (var1.substring((var1.length() / 2), var1.length())));
        System.out.println("Substring of Second String from middle to last is : " + (var2.substring((var2.length() / 2), var2.length())));
        int count = 0;
        System.out.println("Enter Search keyword to find in string");
        String search = sc.next();
        System.out.println("First string Character index ");
        for (int i = 0; i < var1.length(); i++)
        {
            System.out.println("Index of " + var1.charAt(i) + " is " + i);
            if (var1.charAt(i) == search.charAt(0))
            {
                System.out.println(search + " found at index : " + i);
                count++;
            }
        }
        System.out.println(search + "  found in first string " + count + " times");
        System.out.println("Second string Character index ");
        count = 0;
        for (int i = 0; i < var2.length(); i++)
        {
            System.out.println("Index of " + var2.charAt(i) + " is " + i);
            if (var2.charAt(i) == search.charAt(0))
            {
                System.out.println(search + " found at index : " + i);
                count++;
            }
        }
        System.out.println(search + "  found in Second string " + count + " times");
        Stringoperation obj = new Stringoperation();
        obj.toupper(var1);
        obj.toupper(var2);
        sc.close();
    }

    public void toupper(String str)
    {
        System.out.println("Upper Case of the String is : " + (str.toUpperCase()));
    }

}