package execption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Throwable is super class which has
 * Two subclass
 *  one is Exception and Another is Error
 *  We can handle Exception but not Error
 *  Exception has two type - checked and unchecked
 *  checked means client can handle
 *  unchecked means developer handle (run time)
 *  Exception is super class for ArithmaticException , IOException , Indexoutofbound etc
 * */
public class Test
{
    int i = 1, j = 0, k;

    public void test()
    {
        try
        {
            // this block throws a exception if occurs
            // unchecked exception
            k = i / j;
            System.out.println(k);
        }

        catch (ArithmeticException e)
        {
            // this block catch the thrown exception and perform action which we provide it
            // we can have as much as catch block we required
            System.out.println("Can not devide by zero " + e);
        }
        System.out.println(k);
    }

    public void arrTest()
    {
        int[] arr = new int[2];
        try
        {
            arr[0] = 2;
            arr[1] = 4;
            arr[2] = 5;
            arr[3] = 6;
        }
        catch (Exception w)
        {
            System.out.println(" index of array can not be greater than 1 ");
            for (int val : arr)
            {
                System.out.println("element of array are ");
                System.out.println(val);
            }
        }
    }

    public void simpleTest()
    {
        // input from user another way than Scanner class
        System.out.println("enter a val ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a, ka;
        a = 1;
        while (true)
        {
            try
            {
                ka = Double.parseDouble(br.readLine());
                ka = a / ka;
                System.out.printf("the value of a/b is %5f ", ka);
            }
            catch (NumberFormatException e)
            {
                // TODO Auto-generated catch block
                //e.printStackTrace();
                System.out.println("You did not entered a number ");
                break;
            }
            catch (IOException e)
            {
                // TODO Auto-generated catch block
                //e.printStackTrace();
                System.out.println("i/o error");
                System.out.println("Some i/o error");
                break;
            }
            catch (ArithmeticException e)
            {
                System.out.println("Can not devide by zero please try again ");
                continue;
            }
        }
        try
        {
            br.close();
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
