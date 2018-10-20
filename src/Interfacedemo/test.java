package Interfacedemo;

/*Interface is used to achieve complete abstraction in Java.
 *  cannot create instance of an Interface and their methods are declared without any body.
 */
public interface test
{
    double ara(int l, int b, int h);
}

class Tringle implements test
{

    @Override
    public double ara(int l, int b, int h)
    {
        return l * b * h;
    }

}

class Area extends Tringle
{
    public double ara(int l, int b, int h)
    {
        return l * b * h;
    }
}
