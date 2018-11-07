package Chapter2;

import java.util.Arrays;

/**
 * Solution to Coding Question in Section 2.13
 */
public class TwoToOne {
    public static int[] twoToOne(int[][] arr) {
        int[] oned = new int[arr.length * arr[0].length];
        int index = 0;
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                oned[index] = arr[j][i];
                index++;
            }
        }
        return oned;
    }

    public static void main(String[] args) {
        int[][] tst = new int[2][];
        tst[0] = new int[]{1, 2, 3};
        tst[1] = new int[]{6,7,8};
        int[] tst2 = twoToOne(tst);
        System.out.println(Arrays.toString(tst2));
    }
}
