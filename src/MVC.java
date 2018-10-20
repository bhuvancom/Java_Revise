import java.util.Scanner;

/**
 * created by Bhuvaneshvar on 18-10-2018 at 11:37 PM
 **/
public class MVC
{
    public static void main(String[] args)
    {
        View1.main(null);
    }
}

class View1
{
    public static void main(String[] args)
    {
        Scanner std = new Scanner(System.in);

        System.out.println("Enter Rate");
        int rate = std.nextInt();
        System.out.println("Enter Unit");
        int unit = std.nextInt();

        Control demo = new Control(rate, unit);
        System.out.println(demo.getUnit() + " unit at " + demo.getRate() + " rupees is equals =  " + demo.showPrice(rate));
    }
}

class Control extends Model
{
    private int unit;

    public Control(int rate, int unit)
    {
        super(rate);
        this.unit = unit;
    }

    public int getUnit()
    {
        return unit;
    }

    @Override
    int showPrice(int rate)
    {
        return rate * unit;
    }
}

abstract class Model
{
    private int rate;

    public Model(int rate)
    {
        this.rate = rate;
    }

    abstract int showPrice(int rate);

    public int getRate()
    {
        return rate;
    }
}
