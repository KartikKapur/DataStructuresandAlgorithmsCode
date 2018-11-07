package Final;
import org.junit.Test;

import java.util.ArrayList;
/**
 * Created by kartikkapur on 8/16/17.
 */
public class TestDijkstra {

    @Test
    public void testBasic(){
        Room zero = new Room(0, false,4);
        Room one = new Room(1, false,4);
        Room two = new Room(2, false,4);
        Room three = new Room(3, true,4);
        Room[] rooms = new Room[4];
        rooms[0] = zero;
        rooms[1] = one;
        rooms[2] = two;
        rooms[3] = three;
        TeleportMuseum m = new TeleportMuseum(rooms);
        Hall h01 = new Hall(zero, one, 10);
        Hall h12 = new Hall(one, two, 2);
        Hall h13 = new Hall(one, three, 6);
        Hall h23 = new Hall(two, three, 9);
        m.addHall(h01);
        m.addHall(h12);
        m.addHall(h13);
        m.addHall(h23);
        m.teleportInNOut();

    }

    @Test
    public void testComplex(){
        Room zero = new Room(0, false,4);
        Room one = new Room(1, false,4);
        Room two = new Room(2, false,4);
        Room three = new Room(3, true,4);
        Room four = new Room(4, false,4);
        Room[] rooms = new Room[5];
        rooms[0] = zero;
        rooms[1] = one;
        rooms[2] = two;
        rooms[3] = three;
        rooms[4] = four;
        TeleportMuseum m = new TeleportMuseum(rooms);
        Hall h01 = new Hall(zero, one, 3);
        Hall h12 = new Hall(one, two, 2);
        Hall h03 = new Hall(zero, three, 4);
        Hall h24 = new Hall(two, four, 4);
        m.addHall(h01);
        m.addHall(h12);
        m.addHall(h03);
        m.addHall(h24);
        m.teleportInNOut();
    }
}
