package inheritdemo2;

public class Main
{
    public static void main(String[] args)
    {
        Student ob = new Student("Bhuvaneshvar", "Srivastava", "MCA", 78);
        ob.printdetail();

        Teacher ob1 = new Teacher("Rakesh", "Mishra");
        ob1.printdetails();
    }

}
