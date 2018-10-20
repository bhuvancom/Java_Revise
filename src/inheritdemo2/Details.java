package inheritdemo2;

public class Details
{
    private String FirstNM;
    private String SecondNM;

    Details(String FirstNM, String SecondNM)
    {
        this.FirstNM = FirstNM;
        this.SecondNM = SecondNM;
    }

    public void printdetail()
    {
        System.out.println("The name is " + FirstNM + " " + SecondNM);
    }

}
