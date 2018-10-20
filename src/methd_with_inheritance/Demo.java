package methd_with_inheritance;

public class Demo
{
    public static void main(String[] args)
    {
        //int x,y;
        int z = 100, w = 200;
        Expression ob = new Expression(10, 11);
        ob.method(11, 12);
        ob.method(z, w);
    }

}

class Math
{

    int a;
    int b;

    // this will execute first while object creation
    Math(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void sum(int a, int b)
    {
        System.out.println("sum is " + (a + b));
    }

    public void sqr(int x)
    {
        System.out.println("Square is " + (x * x));
    }
}

class Expression extends Math
{

    Expression(int a, int b)
    {
        super(a, b);
    }

    public void method(int a, int b)
    {
        super.sqr(b);
        super.sum(a, b);
        System.out.println("multiplication " + (a * b));
        System.out.println("Value of a is " + a + " and value of b is " + b);
    }

}