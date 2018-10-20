package Access;

public class Classes
{
    // out side of the class a private member is not accessible directly
    protected int b;// protected restrict visibility to world
    private int a; // private member are not visible to world,package and subclass

    public int getA()
    {
        return a;// giving permission to access a
    }

    public void setA(int a)
    {
        this.a = a;// giving permission to set value of a to the out side of the class
    }

}

class class1
{

}

class class2
{

}
