package Midterm2;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * Used to test Problem 5 on Midterm 2
 */
public class LinkToBSTTest {
    @Test
    public void testConvertSmall() {
        LinkToBST b = new LinkToBST();
        LinkedList a = new LinkedList();
        a.add(1);
        a.add(2);
        a.add(3);
        assertEquals(2, b.LinkedListToBST(a).item);
    }

    @Test
    public void testConvertBig() {
        LinkToBST b = new LinkToBST();
        LinkedList a = new LinkedList();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        a.add(7);
        a.add(8);
        a.add(9);
        assertEquals(5, b.LinkedListToBST(a).item);
    }
}
