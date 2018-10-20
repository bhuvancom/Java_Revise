package GeeksForGeeks;

/**
 * created by Bhuvaneshvar on 14-09-2018
 **/
public class StringToNmbrAlphSpecial
{
    public static void main(String[] args)
    {
        String s = "r3%r5%u7#d2$u0!w2#j4\"c2\"u8%f5\"f5\"y1%w9#c4$a9$c8%d4#v7%z7%a0%j6$x2\"o0%i0#t3%s3\"c2#q9!l3!v2$n1#e4#o8%m2#b6%g4$x9!i6$r7%w0%d4\"r2!m8\"i1%n5%z3!u3%f2!a8#g8!z4$n6#v2!o8\"a2%b0$j6#z3%r0!x0$m1%w8%j3$l4!q6\"a4!w6\"f3\"f0!r4$m8$v9#i7$n4$t0$l2\"";
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
        {
            if (Character.isLetter(s.charAt(i)))
            {
                builder.append(s.charAt(i));
            }
            else if (Character.isDigit(s.charAt(i)))
            {
                builder1.append(s.charAt(i));
            }
            else
                builder2.append(s.charAt(i));
        }

        System.out.println(builder + "\n" + builder1 + "\n" + builder2);
    }
}
