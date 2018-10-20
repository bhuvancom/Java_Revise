public interface Mera
{
    String getName();

    String getFatherName();

    int getAge();

    int getSalary();
}

class DataModel implements Mera
{
    private int age;
    private String name;
    private String fatherName;
    private int salary;

    public DataModel(int age, String name, String fatherName, int salary)
    {
        this.age = age;
        this.name = name;
        this.fatherName = fatherName;
        this.salary = salary;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getFatherName()
    {
        return fatherName;
    }

    @Override
    public int getAge()
    {
        return age;
    }

    @Override
    public int getSalary()
    {
        return salary;
    }
}

class Driver
{
    public static void main(String[] args)
    {
        System.out.println(args);
        DataModel dataModel = new DataModel(2, "Akash", "Satish", 2000);

        System.out.println("Name : " + dataModel.getName() + "\tage:"
                + dataModel.getAge() + "\t father name: " + dataModel.getFatherName() + "\t salary: " + dataModel.getSalary());
        new Thread(() -> {
            try
            {
                Thread.sleep(1000);
                System.out.println("Ab hua");
                //Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }).run();
        System.out.println("End of thread sleep");

        new Thread(() -> {
            long debitCardNumber = 1111_2222_33;
            int nm = 0xF345; // for hexa
            int binary = 0b01110; // for binary
            System.out.print(debitCardNumber + " " + nm + " " + binary);
        }).run();

        String str = "Hello"; // create String pool and send reference to str
        String str2 = "Hello"; // chk if same literal exist in  String pool then send reference to var name
        String str3 = new String("Hello");
        //String intern = str3.intern();

        System.out.println(str == str3.intern()); // print false
    }

    private static void nm()
    {
        System.out.println("Hello");
    }


}