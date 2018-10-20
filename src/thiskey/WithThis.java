package thiskey;

public class WithThis
{
    public static void main(String[] args)
    {
        Test ob = new Test();
        ob.m1();
        int b;
        b = ob.setA(12);// setting value of a to 12
        System.out.println(b);// accessing variables
        System.out.println(ob.getA());// a now the value of a has also changed

        // using second class Testing

        Testing objec = new Testing(10, 11);
        objec.m1();
    }

}

class Test
{
    private int a = 10;//instance variable

    void m1()
    {
        System.out.println("the first method called");
        System.out.println("value of a is " + this.getA());
        this.m2();

    }

    void m2()
    {
        System.out.println("method second called");
        System.out.println("value of a is " + getA());
        //this.m1();// infinite loop of calling methods

    }

    public int getA()
    {
        return a;
    }

    public int setA(int a)
    {
        return this.a = a;
    }

}

class Testing
{
    int c, d;

    Testing(int c, int d)
    {
        // will get value of c and 0 if use like this c=c;
        // d=d;
        this.c = c;
        this.d = d;
    }

    void m1()
    {
        System.out.println("the first method called");
        System.out.println("value of c is " + c);
        this.m2();

    }

    void m2()
    {
        System.out.println("method second called");
        System.out.println("value of d is " + d);
        //this.m1();// infinite loop of calling methods

    }
}