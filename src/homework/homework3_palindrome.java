package homework;

import java.util.Scanner;

public class homework3_palindrome
{
    public static void main(String[] args)
    {
        String str;
        Scanner in = new Scanner(System.in);
        str=in.nextLine();
        if(check(str,0,str.length()-1))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
    public static boolean check(String s,int left,int right)
    {
        boolean temp = s.charAt(left) == s.charAt(right);
        if((left == right) || (((left + 1) == right) && temp))
            return  true;
        else if(temp)
            return check(s,left+1,right-1);
        return false;

    }
}
