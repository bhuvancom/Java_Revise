package finalkey;

public class Test extends Hel
{
    public final int number; // variable example

    Test()
    {
        number = 10;//assigned value to number , now this value can not be changed
    }

//	public void sum1(int a, int b)
//	{
//		super.sum1(a, b);
//		System.out.println("Sum is "+(a+b));
//	}
}

final class Hello // a final class can not be inherited
{
    public void sum(int a, int b)
    {
        System.out.println("sum is " + (a + b));
    }
}

class Hel
{
    public final void sum1(int a, int b) // final method can not be overridden
    {
        System.out.println("sum is " + (a + b));
    }
}
