package Hello;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class helloworld {
    public static void main(String[] args)
    {
        String str = showInputDialog("输入数字，用分号分隔");
        String[] num=str.split(";");
        int number1=Integer.parseInt(num[0]);
        int number2=Integer.parseInt(num[1]);
        showMessageDialog(null,"The sum is: " +(number1+number2)
                +"\n"+"The difference is: "+(number1-number2)
                +"\n"+"The product is:  "+(number1*number2)
                +"\n"+"The division is: "+((float)number1/(float)number2));
    }
}
