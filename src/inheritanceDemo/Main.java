package inheritanceDemo;

//inheritance means getting property of already existing class
// super is used to denote super class or main class that is being inherited
// all the class that are using extends key are child class
class First
{
    int a = 10;

    First(int x)
    {
        System.out.println("first class's COnstructor Display");
        System.out.println("The value of x is " + x);
    }

    void dis()
    {
        System.out.println("Parent Class");
        System.out.println("the value of a is " + a);
    }
}

// First is now parent of Display class and Display is child or sub class of First
class Display extends First
{
    int a = 20;

    Display(int y)
    {
        super(y); // calling parent or super class constructor, we use super() to call constructor
        System.out.println("Second class's const \n the value y is " + y);
    }

    // as here the method is same as parent class method (name, return type, and parameters) called overriding
    void dis()
    {
        super.dis();//super class method call  // we user super to call method or variable from parent class
        System.out.println("Child class");
        System.out.println("the value of a  is " + a);
    }

}

public class Main
{
    public static void main(String[] args)
    {

        //we should create object of chil class as we will have all the property of super or parent class
        Display d1 = new Display(10);
        d1.dis();//method call, overriding has happen parent class method has changed to child

    }

}
