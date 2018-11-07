package Final;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;
/**
 * Test made for problem 11 on the final
 */
public class TestMedianHeap {

    @Test
    public void testInsert(){
        MedianHeap mh = new MedianHeap();
        mh.insert(1);
        mh.insert(2);
        mh.insert(3);
        mh.insert(4);
        mh.insert(5);
        mh.insert(6);
        mh.insert(7);
        mh.insert(8);
        mh.insert(9);
        assertEquals(5, mh.median());
    }

    @Test
    public void testBalancing(){
        MedianHeap mh = new MedianHeap();
        mh.insert(1);
        mh.insert(2);
        mh.insert(3);
        mh.insert(4);
        assertEquals(4, mh.size());
    }

    @Test
    public void testSameItems(){
        MedianHeap mh = new MedianHeap();
        mh.insert(1);
        mh.insert(1);
        mh.insert(1);
        mh.insert(1);
        assertEquals(1, mh.median());
    }


}
