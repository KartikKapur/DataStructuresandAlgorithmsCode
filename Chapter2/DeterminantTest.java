package Chapter2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by kartikkapur on 11/15/17.
 */
public class DeterminantTest {


    @Test
    public void testSmallMatrix() {
        Determinant d = new Determinant();
        double[][] a = new double[2][2];
        a[0][0] = 1.0;
        a[0][1] = 2.0;
        a[1][0] = 3.0;
        a[1][1] = 4.0;
        assertEquals(-2.0, d.determinant(a), .0001);
    }

    @Test
    public void testThreebyThree() {
        Determinant d = new Determinant();
        double[][] a = new double[3][3];
        a[0][0] = 1.0;
        a[0][1] = 2.0;
        a[0][2] = -3.0;
        a[1][0] = 2.0;
        a[1][1] = -1.0;
        a[1][2] = 2.0;
        a[2][0] = 3.0;
        a[2][1] = 2.0;
        a[2][2] = 4.0;
        assertEquals(-33.0, d.determinant(a), .0001);
    }

    @Test
    public void testFourbyFour() {
        Determinant d = new Determinant();
        double[][] a = new double[4][4];
        a[0][0] = 1.0;
        a[0][1] = 2.0;
        a[0][2] = 3.0;
        a[0][3] = 4.0;
        a[1][0] = 5.0;
        a[1][1] = 6.0;
        a[1][2] = 7.0;
        a[1][3] = 8.0;
        a[2][0] = 2.0;
        a[2][1] = 6.0;
        a[2][2] = 4.0;
        a[2][3] = 8.0;
        a[3][0] = 3.0;
        a[3][1] = 1.0;
        a[3][2] = 1.0;
        a[3][3] = 2.0;
        assertEquals(72.0, d.determinant(a), .0001);
    }

}
