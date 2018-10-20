package static_demo;

//static member belong to the class  instead of a specific instance
public class Demo
{
    @SuppressWarnings("static-access")
    public static void main(String[] args)
    {
        Methods ob = new Methods();
        System.out.println(Methods.dothi("Bhuvan"));// can not use object reference , used with class
        System.out.println(ob.dothi("I was called by object instance"));
        System.out.println(ob.dothis("Srivastva"));

    }

}
