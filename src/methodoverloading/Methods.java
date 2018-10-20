package methodoverloading;

public class Methods
{
    void Sum(int x, int y)
    {
        System.out.print("Integer sum is : " + (x + y));
    }

    void Sum(float x, float y)
    {
        System.out.print("Float sum is : " + (x + y));
    }
}
