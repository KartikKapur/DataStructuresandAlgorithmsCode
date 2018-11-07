package Final;

/**
 * Used for problem 2 on the pracrice final
 */
public class NewSorts {
    /** Basically pancake sort
     * @param arr an array that needs to be sorted
     * @return a sorted array.
     */
    public static int[] flapJackSort(int arr[]) {
        for (int curr_size = arr.length; curr_size > 1; curr_size--) {
            int syrup = 0;
            for (int choco = 0, chip = 0; chip < curr_size; chip++) {
                if (arr[chip] > arr[choco]) {
                    choco = chip;
                    syrup = choco;
                }
            }
            if (syrup != curr_size - 1) {
                flip(arr, syrup);
                flip(arr, curr_size - 1);
            }
        }

        return arr;
    }

    /**
     * Method helps flip the array around
     * @param arr array that needs sorting
     * @param i the final index that will be reversed, everything will be flipped from (0, i)
     */
    static void flip(int arr[], int i) {
        int temp, start = 0;
        while (start < i) {
            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }
    }

    /**
     * "Sorts" the array by changing the values via brute force
     * @param arr Array that needs to be sorted
     * @return an imposter array that is considered sorted but has changed values.
     */
    static int[] waffle(int[] arr){
        int[] syrup = arr;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                arr[i] = arr[i-1] + 1;
            }
        }
        return syrup;
    }

    /**
     * Variation of gnome sort
     * @param ar array that needs to be sorted
     */
    public static void dwarfSort(int[] ar) {
        int i = 1;
        int N = ar.length;
        while (i < N) {
            if (i == 0 || ar[i - 1] <= ar[i]) {
                i++;
            } else {
                int tmp = ar[i];
                ar[i] = ar[i - 1];
                ar[i-1] = tmp;
                i--;
            }
        }
    }




}
