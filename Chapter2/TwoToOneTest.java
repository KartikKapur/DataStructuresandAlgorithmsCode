package Chapter2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit tests for the coding question
 */

public class TwoToOneTest {

    @Test
    public void twoRows(){
        int[][] tst = new int[2][];
        tst[0] = new int[]{1, 2, 3};
        tst[1] = new int[]{6,7,8};
        int[] tst2 = TwoToOne.twoToOne(tst);
        int[] real = new int[]{1, 6, 2, 7, 3, 8};
        assertArrayEquals(real, tst2);
    }

    @Test
    public void threeRows(){
        int[][] tst = new int[3][];
        tst[0] = new int[]{1, 2, 3};
        tst[1] = new int[]{6,7,8};
        tst[2] = new int[]{12, 13, 14};
        int[] tst2 = TwoToOne.twoToOne(tst);
        int[] real = new int[]{1, 6, 12, 2, 7, 13, 3, 8, 14};
        assertArrayEquals(real, tst2);
    }
}
