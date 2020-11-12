package game;

public class HandleGo extends Handle {

    public HandleGo(Game game) {
        super(game);
        // TODO Auto-generated constructor stub
    }

    @Override
    void doCmd(String word) {
        game.goRoom(word);
    }

}
