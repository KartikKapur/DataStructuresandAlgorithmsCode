package Midterm1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit Test for Problem 5, Midterm 1, Practice Test 1.
 */
public class IntListTest {
    @Test
    public void testConstruction() {
        IntList i = new IntList(1, null);
        i.addLast(2);
        i.addLast(2);
        IntList q = new IntList(1, null);
        q.addLast(2);
        q.addLast(2);
        IntList temp = i;
        for (int len = 0; len < q.size(); len++) {
            assertEquals(q.first, temp.first);
        }
    }

    @Test
    public void testSize(){
        IntList i = new IntList(1, null);
        i.addLast(2);
        i.addLast(2);
        assertEquals(3, i.size());
    }

    @Test
    public void testAddAdjacentSmall() {
        IntList i = new IntList(1, null);
        i.addLast(2);
        i.addLast(2);
        IntList temp = i;
        i.addAdjacent();
        IntList q = new IntList(1, null);
        q.addLast(4);
        for (int len = 0; len < q.size(); len++) {
            assertEquals(q.first, temp.first);
        }
    }

    @Test
    public void testAddAdjacentLarge() {
        IntList i = new IntList(4, null);
        i.addLast(2);
        i.addLast(1);
        i.addLast(1);
        i.addLast(9);
        IntList temp = i;
        i.addAdjacent();
        IntList q = new IntList(8, null);
        q.addLast(9);
        q.addLast(4);
        for (int len = 0; len < q.size(); len++) {
            assertEquals(q.first, temp.first);
        }
    }

    @Test
    public void testAddAdjacentRecursiveSmall() {
        IntList i = new IntList(1, null);
        i.addLast(2);
        i.addLast(2);
        IntList temp = i;
        i.addAdjacentRecursive();
        IntList q = new IntList(1, null);
        q.addLast(4);
        for (int len = 0; len < q.size(); len++) {
            assertEquals(q.first, temp.first);
        }
    }

    @Test
    public void testAddAdjacentRecursiveLarge() {
        IntList i = new IntList(4, null);
        i.addLast(2);
        i.addLast(1);
        i.addLast(1);
        i.addLast(9);

        IntList temp = i;
        i.addAdjacentRecursive();
        IntList q = new IntList(8, null);
        q.addLast(9);
        q.addLast(4);
        for (int len = 0; len < q.size(); len++) {
            assertEquals(q.first, temp.first);
        }
    }

    @Test
    public void testDreaming(){
        IntList i = new IntList(0, null);
        i.dreaming(1);
        i.dreaming(2);
        i.dreaming(3);
        i.dreaming(4);
        IntList q = new IntList(0, null);
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
        q.addLast(4);
        for (int len = 0; len < q.size(); len++) {
            assertEquals(q.first, q.first);
        }
    }
    @Test
    public void testDreamingReplace(){
        IntList i = new IntList(0, null);
        i.dreaming(1);
        i.dreaming(2);
        i.dreaming(3);
        i.dreaming(4);
        i.dreaming(5);
        i.dreaming(6);
        IntList q = new IntList(2, null);
        q.addLast(3);
        q.addLast(4);
        q.addLast(5);
        q.addLast(6);
        for (int len = 0; len < q.size(); len++) {
            assertEquals(q.first, q.first);
        }
    }
}
