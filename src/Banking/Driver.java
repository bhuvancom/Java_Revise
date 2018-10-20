package Banking;

public class Driver
{

    public static void main(String[] args)
    {

        Banking obj1 = new Banking("Bhuvaneshvar", 123456);
        obj1.addmoney(10);
        obj1.details();
        obj1.addmoney(20);

        Banking parul = new Banking("Parul", 9628656);
        parul.details();
        parul.addmoney(20);
        parul.withdrawmoney(10);
        parul.details();
        Banking.getusers();
        parul.details();
        parul.withdrawmoney(11);
    }
}

