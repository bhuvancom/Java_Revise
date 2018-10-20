package inheritdemo2;

public class Student extends Details
{
    private String branch;
    private double percent;

    Student(String FirstNM, String SecondNM, String branch, double percent)
    {
        super(FirstNM, SecondNM);
        this.percent = percent;
        this.branch = branch;

    }

    public void printdetail()
    {
        System.out.println("Student Details");
        super.printdetail();
        System.out.println("\t" + branch);
        System.out.println("\t" + percent + "%");
    }

}
