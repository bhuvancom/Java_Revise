package useOfStatic;

public class Driver
{
    public static void main(String[] args)
    {
        Class1 bhu = new Class1();
        bhu.age = 24;
        bhu.name = "bhuvaneshvar";
        System.out.println(Class1.getnoOf());
        Class1 aka = new Class1();
        System.out.println(aka.noOfstudent);//by instance
        System.out.println(Class1.getnoOf());//by class name

    }

}
