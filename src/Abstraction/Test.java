package Abstraction;

/* If a class contain any abstract method then
  the class is declared as abstract class. 
  An abstract class is never instantiated.
*/
public class Test extends Inher
{

    @Override
    void val()
    {
        System.out.println("The abstract method has body now by using Test class ");

    }

}

class C2 extends Inher
{

    @Override
    void val()
    {
        System.out.println("The abstract method has body now using C2 class");
    }

}

abstract class Inher
{
    abstract void val();

    /* Method that are declared without any
     body within an abstract class are called abstract method.
     The method body will be defined by its subclass.
     Abstract method can never be final and static.
     Any class that extends an abstract class must implement
     all the abstract methods declared by the super class.
    */
    public void show() /*( concrete method ) Abstract classes can also have normal
	methods with definitions, along with abstract methods 
	*/
    {
        System.out.println("This is concrete method ");
    }
}
