package Final;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Tests for problem 4 on the practice final.
 */
public class TestGem {

    @Test
    public void testRoomHall() {
        Room zero = new Room(0, false, 3);
        Room one = new Room(1, false, 3);
        Room two = new Room(2, false, 3);
        Room three = new Room(3, true, 3);
        Room[] rooms = new Room[4];
        rooms[0] = zero;
        rooms[1] = one;
        rooms[2] = two;
        rooms[3] = three;
        Museum m = new Museum(rooms);
        Hall h01 = new Hall(zero, one, 10);
        Hall h02 = new Hall(zero, two, 2);
        Hall h12 = new Hall(one, two, 4);
        Hall h13 = new Hall(one, three, 6);
        m.addHall(h01);
        m.addHall(h02);
        m.addHall(h12);
        m.addHall(h13);
        assertTrue(m.adj.get(2).contains(h12));
        assertTrue(m.adj.get(3).contains(h13));
        assertTrue(m.adj.get(1).contains(h13));
        assertFalse(m.adj.get(2).contains(h13));
        assertTrue(three.hasGem);
    }

    @Test
    public void testFirstSteal() {
        Room zero = new Room(0, false, 3);
        Room one = new Room(1, false, 3);
        Room two = new Room(2, false, 3);
        Room three = new Room(3, true, 3);
        Room[] rooms = new Room[4];
        rooms[0] = zero;
        rooms[1] = one;
        rooms[2] = two;
        rooms[3] = three;
        Museum m = new Museum(rooms);
        Hall h01 = new Hall(zero, one, 10);
        Hall h02 = new Hall(zero, two, 2);
        Hall h03 = new Hall(zero, three, 4);
        Hall h12 = new Hall(one, two, 2);
        Hall h13 = new Hall(one, three, 1);
        Hall h23 = new Hall(two, three, 9);
        m.addHall(h01);
        m.addHall(h02);
        m.addHall(h03);
        m.addHall(h12);
        m.addHall(h13);
        m.addHall(h23);
        m.steal();
    }

    @Test
    public void testGoIn() {
        Room zero = new Room(0, false, 4);
        Room one = new Room(1, false, 4);
        Room two = new Room(2, false, 4);
        Room three = new Room(3, true, 4);
        Room[] rooms = new Room[4];
        rooms[0] = zero;
        rooms[1] = one;
        rooms[2] = two;
        rooms[3] = three;
        Museum m = new Museum(rooms);
        Hall h01 = new Hall(zero, one, 2);
        Hall h02 = new Hall(zero, two, 4);
        Hall h03 = new Hall(zero, three, 3);
        Hall h12 = new Hall(one, two, 5);
        Hall h13 = new Hall(one, three, 6);
        Hall h23 = new Hall(two, three, 7);
        m.addHall(h01);
        m.addHall(h02);
        m.addHall(h03);
        m.addHall(h12);
        m.addHall(h13);
        m.addHall(h23);
        assertEquals(m.goIn(new ArrayList<>()).order, 3);

    }

    /**
     * Order on the way to the gem is 0,1,2,3,7. Order on the way back is 7,2,0.
     */
    @Test
    public void largeMuseum() {
        Room zero = new Room(0, false, 7);
        Room one = new Room(1, false, 7);
        Room two = new Room(2, false, 7);
        Room three = new Room(3, false, 7);
        Room four = new Room(4, false, 7);
        Room five = new Room(5, false, 7);
        Room six = new Room(6, false, 7);
        Room seven = new Room(7, true, 7);
        Room[] rooms = new Room[8];
        rooms[0] = zero;
        rooms[1] = one;
        rooms[2] = two;
        rooms[3] = three;
        rooms[4] = four;
        rooms[5] = five;
        rooms[6] = six;
        rooms[7] = seven;
        Museum m = new Museum(rooms);
        Hall h01 = new Hall(zero, one, 1);
        Hall h02 = new Hall(zero, two, 2);
        Hall h03 = new Hall(zero, three, 3);
        Hall h04 = new Hall(zero, four, 4);
        Hall h05 = new Hall(zero, five, 5);
        Hall h06 = new Hall(zero, six, 6);
        Hall h07 = new Hall(zero, seven, 7);
        Hall h12 = new Hall(one, two, 3);
        Hall h13 = new Hall(one, three, 6);
        Hall h14 = new Hall(one, four, 8);
        Hall h15 = new Hall(one, five, 9);
        Hall h16 = new Hall(one, six, 10);
        Hall h17 = new Hall(one, seven, 11);
        Hall h23 = new Hall(two, three, 2);
        Hall h24 = new Hall(two, four, 5);
        Hall h25 = new Hall(two, five, 7);
        Hall h26 = new Hall(two, six, 9);
        Hall h27 = new Hall(two, seven, 4);
        Hall h34 = new Hall(three, four, 8);
        Hall h35 = new Hall(three, five, 9);
        Hall h36 = new Hall(three, six, 10);
        Hall h37 = new Hall(three, seven, 5);
        Hall h45 = new Hall(four, five, 10);
        Hall h46 = new Hall(four, six, 11);
        Hall h47 = new Hall(four, seven, 12);
        Hall h56 = new Hall(five, six, 13);
        Hall h57 = new Hall(five, seven, 14);
        Hall h67 = new Hall(six, seven, 1);
        m.addHall(h01);
        m.addHall(h02);
        m.addHall(h03);
        m.addHall(h04);
        m.addHall(h05);
        m.addHall(h06);
        m.addHall(h07);
        m.addHall(h12);
        m.addHall(h13);
        m.addHall(h14);
        m.addHall(h15);
        m.addHall(h16);
        m.addHall(h17);
        m.addHall(h23);
        m.addHall(h24);
        m.addHall(h25);
        m.addHall(h26);
        m.addHall(h27);
        m.addHall(h34);
        m.addHall(h35);
        m.addHall(h36);
        m.addHall(h37);
        m.addHall(h45);
        m.addHall(h46);
        m.addHall(h47);
        m.addHall(h56);
        m.addHall(h57);
        m.addHall(h67);
//        assertEquals(7, m.goIn(new ArrayList<>()).order );
        m.steal();

    }
}
