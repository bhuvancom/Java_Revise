package inheritancedemo2;

public class Driver
{
    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle();
        Tringle tri = new Tringle();
        rec.setv(10, 20);//calling super class method
        tri.setv(20, 30);
        System.out.println("area of rect " + rec.area());
        System.out.println("area of tring " + tri.area());
    }
}
