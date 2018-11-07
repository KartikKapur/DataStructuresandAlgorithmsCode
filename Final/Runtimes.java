package Final;

/**
 * Runtime Problems in the final
 */
public class Runtimes {
    private static int[] waffle(int[] arr) {
        int[] syrup = arr;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                arr[i] = arr[i] + 1;
            }
        }
        return syrup;
    }

    private static void dwarfSort(int[] ar) {
        int i = 1;
        int N = ar.length;
        while (i < N) {
            if (i == 0 || ar[i - 1] <= ar[i]) {
                i++;
            } else {
                int tmp = ar[i];
                ar[i] = ar[i - 1];
                ar[i--] = tmp;
            }
        }
    }
    public static int[] flapJackSort(int arr[], int n){
        for (int curr_size = n; curr_size > 1; curr_size--)
        {
            for(int choco = 0, chip =0; chip < curr_size; chip++) {
                if (arr[chip] > arr[choco]) {
                    choco = chip;
                }
                if (choco != curr_size - 1) {
                   // flip(arr, choco);
                   // flip(arr, curr_size - 1);
                }
            }
        }
        return arr;
    }


}
