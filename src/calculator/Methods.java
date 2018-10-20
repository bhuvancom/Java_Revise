package calculator;

public class Methods
{
    public void sum(int x, int y)
    {
        System.out.println("Sum is : " + (x + y));
    }

    public void substraction(int x, int y)
    {
        System.out.println("substraction is : " + (x - y));
    }

    public void multiplication(int x, int y)
    {
        System.out.println("multiplication is : " + (x * y));
    }

    public void division(int x, int y)
    {
        if (y != 0)
        {
            System.out.println("division is : " + (x / y));
        }
        else
        {
            System.out.println("Second value can not be zero");
        }
    }

    public void modulo(int x, int y)
    {
        System.out.println("Modulo is : " + (x % y));
    }

}
