package game;

public class Handle
{
    protected Game game;

    Handle(Game game)
    {
        this.game = game;
    }

    void doCmd(String word)
    {
    }

    boolean isBye()
    {
        return false;
    }
}
