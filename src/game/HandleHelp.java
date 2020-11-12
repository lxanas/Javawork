package game;

public class HandleHelp extends Handle
{

    public HandleHelp(Game game)
    {
        super(game);
        // TODO Auto-generated constructor stub
    }

    @Override
    void doCmd(String word)
    {
        System.out.println("迷路了吗，你可以输入 go bye ");
        System.out.println("例如 go east");
    }


}
