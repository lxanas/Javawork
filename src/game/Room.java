package game;

import java.util.HashMap;

public class Room
{
    private String location;
    HashMap<String, Room> hm = new HashMap<String, Room>();
    Room(String location) {
        this.location = location;
    }
    void setExit( String dir, Room room) {
        hm.put(dir, room);
    }
    String getExit() {
        StringBuffer sb = new StringBuffer();
        sb.append(hm.keySet());
        return sb.toString();
    }
    Room getRoom( String dir ) {
        return hm.get(dir);
    }
    @Override
    public String toString() {
        return location;
    }
}
