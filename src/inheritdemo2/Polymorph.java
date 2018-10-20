package inheritdemo2;

public class Polymorph
{
    public static void main(String[] args)
    {
        Details details[] = new Details[4]; //4 instances
        details[0] = new Student("Bhuvaneshvar", "Srivastava", "MCA", 78);
        details[1] = new Student("Shivam", "Gupta", "MCA", 70);
        details[2] = new Student("Parul", "Panddey", "MCA", 77);
        details[3] = new Teacher("Rakesh", "Mishra");//  Polymorphism

        for (Details detail : details) //for each loop
        {
            detail.printdetail();
        }
    }
}
