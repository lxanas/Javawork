package lx.utils;

public class MyStringUtil
{
    public String reverseString(String inputStr)
    {
        StringBuffer sb = new StringBuffer();
        for (int i = inputStr.length() - 1; i >= 0; i--)
        {
            sb.append(inputStr.charAt(i));
        }
        return sb.toString();
    }

}