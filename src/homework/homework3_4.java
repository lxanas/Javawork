package homework;

import java.util.Scanner;

public class homework3_4
{
    public static void main(String[] args)
    {
        System.out.println("请输入Unicode字符对应的十六进制数字");
        Scanner in = new Scanner(System.in);
        String hex_num = in.nextLine();
        char dec_num = (char) Long.parseLong(hex_num, 16);
        System.out.println("以下为你的Unicode字符");
        System.out.println(dec_num);
        System.out.println("三秒后输出全部Unicode字符");
        try
        {
            Thread.sleep(3000);

        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        char c = '\u0000';
        for (int i = 0; i <= 1114111; i++)
        {
            System.out.println(c);
            c++;
        }
    }
}
