package Banking;

public class Banking
{
    static String branch = "Shimla";
    static String ifsc = "SHIMLA01234";
    static int users = 0;
    String userName;
    int account;
    int money;

    public Banking(String userName, int account)
    {
        this.userName = userName;
        this.account = account;
        money = 0;
        System.out.println("Welcome  " + userName + "\n Your account number is " + account);
        users++;
    }

    public static void getusers()
    {
        System.out.println("Number of users are " + users);
    }

    public void details()
    {
        System.out.println(
                " Bank branch : " + branch + "\n" +
                        " IFSC code : " + ifsc + "\n" +
                        " User name : " + userName + "\n" +
                        " account number : " + account + "\n" +
                        " account balance : " + money);
    }

    public void addmoney(int added_money)
    {
        money = money + added_money;
        System.out.println("You have added " + added_money + " in your account " +
                "\n available balance is " + money);
    }

    public void withdrawmoney(int paise)
    {
        if (paise > money)
        {
            System.out.println("There is no over Draft system here :-) \nn you have " + money + " in your account Withdrawn limit is " + money);
        }
        else
        {
            money = money - paise;
            System.out.println("You have withdrawn " + paise + " from your account \n available balance is " + money);
        }
    }
}
