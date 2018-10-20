package inheritdemo2;

public class Teacher extends Details
{

    Teacher(String FirstNM, String SecondNM)
    {
        super(FirstNM, SecondNM);

    }

    public void printdetails()
    {
        System.out.println("Teacher details");
        //overriding method
        super.printdetail();
    }

}
