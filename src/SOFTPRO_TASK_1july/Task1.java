package SOFTPRO_TASK_1july;

import java.util.Scanner;

public class Task1
{
    private String name;
    private int account_number;
    private String account_type;
    private double account_bal;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int account_number = scanner.nextInt();
        String acc_type;
        System.out.println("Enter 1 for Saving account \n2 for Current account");
        int i = scanner.nextInt();
        if (i == 1)
            acc_type = "Saving";
        else if (i == 2)
            acc_type = "Current";
        else
        {
            System.out.println("Wrong entry");
            acc_type = null;
        }
        Task1 task1 = new Task1();
        task1.setdata(name, account_number, acc_type);
        task1.display();
        task1.deposite();
        task1.display();
        task1.withdraw();
        task1.display();
    }

    public void setdata(String name, int account_number, String account_type)
    {
        this.account_number = account_number;
        this.account_type = account_type;
        this.name = name;
        this.account_bal = 0.0;
    }

    public void deposite()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to Deposit ");
        double amount = scanner.nextDouble();
        account_bal += amount;
        System.out.println("Updated Account balance : " + account_bal);
    }

    public void withdraw()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount to Withdraw ");
        double amount = scanner.nextDouble();
        if (amount > account_bal)
        {
            System.out.println("Not enough balance");
        }
        else
            account_bal -= amount;
        System.out.println("Updated Account Balance : " + account_bal);
    }

    public void display()
    {
        System.out.println("Name : " + name + "\n" +
                "Account number : " + account_number + "\n" +
                "Account type : " + account_type + "\n" +
                "Balance : " + account_bal);
    }


}
