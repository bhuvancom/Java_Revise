package SOFTPRO_TASK_1july;

public class Task4
{
    private float p, n;
    private float r;

    Task4(float principle, float time, float rate)
    {
        p = principle;
        n = time;
        r = rate;
    }

    public static void main(String[] args)
    {
        Task4 obj = new Task4(20000, 3, 10);
        obj.simpleInn();
        obj.p = 30000;
        obj.simpleInn();
        Task4 obj2 = new Task4(40000, 5, 10);
        obj2.simpleInn();
        obj.simpleInn();
    }

    public void simpleInn()
    {
        float interest = (p * n * r) / 100;
        System.out.println("Simple Interest = " + interest);
    }
}
