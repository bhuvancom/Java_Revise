package Access;

public class Demo
{
    public static void main(String[] args)
    {
        Classes ob = new Classes();
        ob.setA(10);
        System.out.println(ob.getA());

        Classes ob1 = new Classes();
        ob1.setA(11);
        System.out.println(ob1.getA());
    }

}
