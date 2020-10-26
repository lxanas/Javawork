package OOP_1;
class Value{
    private int i;

    public int getI()
    {
        return i;
    }

    public void setI(int i)
    {
        this.i = i;
    }
}

public class test3
{
    public static void main(String[] args)
    {
        Value[] a=new Value[10];
        for (int i = 0; i < a.length; i++)
        {
            a[i]=new Value();
            a[i].setI(i);
        }
        for(Value v:a)
        {
            System.out.println(v.getI());
            v.setI(0);
        }
        for(Value v:a)
        {
            System.out.println(v.getI());
        }
    }
}
