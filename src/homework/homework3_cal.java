package homework;

import java.math.BigInteger;
import java.util.Scanner;

public class homework3_cal
{
    public static long cal(int n)
    {
        if (n == 1 || n == 0)
        {
            return 1;
        } else
        {
            return n * cal(n - 1);
        }
    }

    public static BigInteger super_cal(int n)
    {
        if (n == 1 || n == 0)
            return BigInteger.valueOf(1);
        else
        {
            return BigInteger.valueOf(n).multiply(super_cal(n - 1));
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (i <= 20)
            System.out.println(cal(i));
        else
            System.out.println(super_cal(i));
        }
    }
