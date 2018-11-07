package Final;

import java.util.LinkedList;

/**
 * Practice Final problem 4
 */
public class Room {
    public LinkedList<Hall> adjacentHall;
    boolean beenTo = false;
    public boolean hasGem;
    public int order;
    public Room(int order, boolean gem, int rooms) {
        this.order = order;
        this.hasGem = gem;
        Hall [] temp = new Hall[rooms];
        this.adjacentHall = new LinkedList<Hall>();
//        for(int i = 0; i < rooms; i++){
//            adjacentHall.add(null);
//        }
    }
}
