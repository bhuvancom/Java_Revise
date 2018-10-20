package thiskey;

class Usingthi
{
    //creating constructor the method name is same as classname
    // with 3 parameter
    Usingthi(int x, int y, int z)
    {
        // this()means reference to constructor
        this(x, y);// here this keyword is reference of the calling object means object instance obj
        System.out.println("value of z is " + z);

    }

    // with 2 parameter
    Usingthi(int x, int y)
    {

        this(x);// here this keyword reference the calling object in our case obj object
        System.out.println("value of y is " + y);
    }

    // with 1 parameter
    Usingthi(int x)
    {
        System.out.println("value of x is " + x);

    }
}

public class Demo
{
    public static void main(String[] args)
    {
        @SuppressWarnings("unused")
        Usingthi obj = new Usingthi(10, 11, 12); // constructor calling
        // System.out.println(obj.getClass());


    }
}


