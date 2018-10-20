package useOfStatic;

public class Class1
{
    static int noOfstudent = 0;
    String name;
    int age;

    Class1()
    {
        noOfstudent++;//increment every time this class is used
    }

    public static int getnoOf()
    {
        return noOfstudent;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getage()
    {

        return age;
    }

    public void setage(int age)
    {
        this.age = age;
    }

}
