import java.util.Scanner;

class Solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        // Write your code here.
        scan.close();
        String[] tokens = s.split("[!,?._'@ ]++");
        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++)
            System.out.println(tokens[i].length());

        Solution solution = new Gem();
        solution.dis();
        int n = 1;
        System.out.println("ss " + 5 + 3 * 2 + 4 / 2 + 3 % 2 + n++);
    }

    void dis()
    {
        int n = 10;
        System.out.print("Cape " + n);
    }
}

class Gem extends Solution
{
    void dis()
    {
        int n = 1;
        System.out.print("dusra " + n);
    }
}