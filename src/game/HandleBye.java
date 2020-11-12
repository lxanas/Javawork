package game;

public class HandleBye extends Handle {

    public HandleBye(Game game) {
        super(game);
        // TODO Auto-generated constructor stub
    }

    @Override
    boolean isBye() {
        return true;
    }

    @Override
    void doCmd(String word) {
        System.out.println("欢迎您的光临，再见。");
    }

}
