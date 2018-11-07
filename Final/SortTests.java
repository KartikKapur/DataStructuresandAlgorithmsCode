package Final;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.Test;


import static org.junit.Assert.*;

/**
 * Tests to make sure problem 2 of the final is functioning.
 */
public class SortTests {

    @Test
    public void testFlapjackSortFewFlips() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int temp = arr[1];
        arr[1] = arr[9];
        arr[9] = temp;
        int[] sorted = NewSorts.flapJackSort(arr);
        assertEquals(10, sorted.length);
        for (int i = 0; i < sorted.length; i++) {
            assertEquals(i, sorted[i]);
        }

    }

    @Test
    public void testFlapjackSortManyFlips() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        int[] sorted = NewSorts.flapJackSort(arr);
        assertEquals(10, sorted.length);
        for (int i = 0; i < sorted.length; i++) {
            assertEquals(i + 1, sorted[i]);
        }

    }

    @Test
    public void testWaffle() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        int[] sorted = NewSorts.waffle(arr);
        for (int i = 1; i < sorted.length; i++) {
            assertTrue(sorted[i] >= sorted[i - 1]);
        }
    }

    @Test
    public void testDwarfSort(){
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
        }
        NewSorts.dwarfSort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(i + 1, arr[i]);
        }
    }

    @Test
    public void testDwarfSortSmall() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int temp = arr[1];
        arr[1] = arr[9];
        arr[9] = temp;
        NewSorts.dwarfSort(arr);
        assertEquals(10, arr.length);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(i, arr[i]);
        }

    }

}
