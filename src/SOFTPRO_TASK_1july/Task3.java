package SOFTPRO_TASK_1july;

public class Task3
{
    private double length, width;

    Task3(double length, double width)
    {
        this.width = width;
        this.length = length;
    }

    public static void main(String[] args)
    {
        Task3 task3 = new Task3(10, 20);
        task3.rectarea();
        task3.rectperi();

    }

    public void rectarea()
    {
        System.out.println("Area is " + length * width);
    }

    public void rectperi()
    {
        System.out.println("Perimeter is " + 2 * (length + width));
    }
}
