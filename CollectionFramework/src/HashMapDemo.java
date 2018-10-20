/**
 * <p>created by Bhuvaneshvar on 20-10-2018 at 08:11 PM</p>
 **/

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
    public static void main(String[] args)
    {
        //Scanner std = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        map.put("Bhuvan", 915153);
        map.put("Akash", 700744);

        boolean nn = map.containsKey("Akash");

        if (nn)
            System.out.println("Akash=" + map.get("Akash"));

        else
            System.out.println("Not found");
    }
}
