package game;

import java.util.HashMap;
import java.util.Scanner;

public class Game
{
    private Room currentRoom;
    private HashMap<String, Handle> handles = new HashMap<>();

    Game()
    {
        handles.put("help", new HandleHelp(this));
        handles.put("bye", new HandleBye(this));
        handles.put("go", new HandleGo(this));
        setRoom();
    }

    public void setRoom()
    {
        Room outside = new Room("城堡外");
        Room lobby = new Room("大堂");
        Room pub = new Room("小酒馆");
        Room study = new Room("书房");
        Room bedRoom = new Room("卧室");
        Room bathRoom = new Room("卫生间");
        outside.setExit("east", lobby);
        outside.setExit("west", pub);
        outside.setExit("south", study);
        pub.setExit("east", outside);
        lobby.setExit("west", outside);
        study.setExit("north", outside);
        study.setExit("east", bedRoom);
        bedRoom.setExit("west", study);
        bedRoom.setExit("up", bathRoom);
        bathRoom.setExit("down", bedRoom);
        currentRoom = outside;
    }

    void Welcome()
    {
        System.out.println("欢迎来到城堡游戏");
        System.out.println("你可以输入help来查看相关玩法");
        System.out.println("那么游戏开始啦");
        getExitSoc();
    }

    void getExitSoc()
    {
        System.out.println("你当前的位置在" + currentRoom);
        System.out.print("出口有:");
        System.out.println(currentRoom.getExit());
    }

    void goRoom(String loc)
    {
        Room nextRoom = currentRoom.getRoom(loc);
        if (nextRoom != null)
        {
            currentRoom = nextRoom;
            getExitSoc();
        }
        else System.out.println("那里没有门");
    }

    void play()
    {
        Scanner in = new Scanner(System.in);
        while (true)
        {
            String l = in.nextLine();
            String[] words = l.split(" ");
            Handle handle = handles.get(words[0]);
            String value = "";
            if (words.length > 1)
            {
                value = words[1];
            }
            if (handle != null)
            {
                handle.doCmd(value);
                if (handle.isBye())
                {
                    break;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Game game = new Game();
        game.Welcome();
        game.play();
    }
}
