package Midterm1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Problem 10 Midterm 1 Practice Test 1
 */
public class ArghRaysTest {

    @Test
    public void testSortByLat() {
        Piece p1 = new Piece(-100, 30);
        Piece p2 = new Piece(-50, 20);
        Piece p3 = new Piece(-25, 10);
        Piece p4 = new Piece(-25, 30);
        Piece p5 = new Piece(-100, 10);
        Piece p6 = new Piece(-50, 30);
        Piece p7 = new Piece(-50, 10);
        Piece p8 = new Piece(-25, 20);
        Piece p9 = new Piece(-100, 20);
        Piece[] arr = new Piece[9];
        arr[0] = p2;
        arr[1] = p1;
        arr[2] = p3;
        arr[3] = p4;
        arr[4] = p5;
        arr[5] = p9;
        arr[6] = p6;
        arr[7] = p7;
        arr[8] = p8;
        PuzzleSolver p = new PuzzleSolver();
        Piece[][] twod = p.sortByLat(arr);
        assertEquals(3, twod.length);
        for (int i = 0; i < twod[0].length; i++) {
            assertEquals(30, twod[0][i].latitude);
        }
        for (int i = 0; i < twod[0].length; i++) {
            assertEquals(20, twod[1][i].latitude);
        }

        for (int i = 0; i < twod[0].length; i++) {
            assertEquals(10, twod[2][i].latitude);
        }
    }

    @Test
    public void testSortFully() {
        Piece p1 = new Piece(-100, 30);
        Piece p2 = new Piece(-50, 20);
        Piece p3 = new Piece(-25, 10);
        Piece p4 = new Piece(-25, 30);
        Piece p5 = new Piece(-100, 10);
        Piece p6 = new Piece(-50, 30);
        Piece p7 = new Piece(-50, 10);
        Piece p8 = new Piece(-25, 20);
        Piece p9 = new Piece(-100, 20);
        Piece[] arr = new Piece[9];
        arr[0] = p2;
        arr[1] = p1;
        arr[2] = p3;
        arr[3] = p4;
        arr[4] = p5;
        arr[5] = p9;
        arr[6] = p6;
        arr[7] = p7;
        arr[8] = p8;
        PuzzleSolver p = new PuzzleSolver();
        Piece[][] twod = p.sortByLat(arr);
        assertEquals(3, twod.length);
        for (int i = 0; i < twod[0].length; i++) {
            assertEquals(30, twod[0][i].latitude);
        }
        for (int i = 0; i < twod[0].length; i++) {
            assertEquals(20, twod[1][i].latitude);
        }

        for (int i = 0; i < twod[0].length; i++) {
            assertEquals(10, twod[2][i].latitude);
        }
        twod = p.sortFully(twod);
        for (int i = 0; i < twod[0].length; i++) {
            assertEquals(-100, twod[i][0].longitude);
        }
        for (int i = 0; i < twod[0].length; i++) {
            assertEquals(-50, twod[i][1].longitude);
        }
        for (int i = 0; i < twod[0].length; i++) {
            assertEquals(-25, twod[i][2].longitude);
        }

    }
}
