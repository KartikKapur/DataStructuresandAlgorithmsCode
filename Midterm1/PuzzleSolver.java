package Midterm1;

/**
 * Problem 10 Midterm 1 Practice Test 1 Solution
 * This solution is pretty complicated and we start by finding all the elements
 * that have the same latitude, and putting them in "buckets" so to speak.
 * We then sort these buckets by their latitude.
 */
public class PuzzleSolver {
    PuzzleSolver() {

    }

    /*
     * This solution is pretty complicated and we start by finding all the elements
 * that have the same latitude, and putting them in "buckets" so to speak.
 * We then sort these buckets by their longitude.
     */

    public Piece[][] sortByLat(Piece[] p){
        int width = (int) Math.sqrt(p.length);
        Piece[][] latSort = new Piece[width][width];
        for(int i = 0; i < p.length; i++){
            for(int j = 0; j < latSort.length; j++){
                if(latSort[j][0] == null){
                    latSort[j][0] = p[i];
                    break;
                }
                else if(latSort[j][0].latitude == p[i].latitude){
                    int counter = 0;
                    while(counter + 1 < p.length && latSort[j][counter] != null){
                        counter++;
                    }
                    latSort[j][counter] = p[i];
                    break;
                }
            }
        }
        latSort = sortLatitudes(latSort);
        return latSort;
    }

    private Piece[][] sortLatitudes(Piece[][] unsorted){
        Piece[][] sorted = new Piece[unsorted.length][unsorted.length];
        int count = 0;
        while(count < unsorted.length){
            int maximum = Integer.MIN_VALUE;
            int maxindex =0;
            for(int i = 0; i < unsorted.length; i++){
                if(unsorted[i] != null && unsorted[i][0].latitude > maximum){
                    maximum = unsorted[i][0].latitude;
                    maxindex = i;
                }
            }
            sorted[count] = unsorted[maxindex];
            unsorted[maxindex] = null;
            count++;
        }
        return sorted;
    }

    /*
    Because we are using a small amount of inputs (at least for this use case). I used
    insertion sort rather than heap sort. Additionally, I felt that Insertion Sort would
    be one of the easier sorts to come up with during a test.
     */
    public Piece[][] sortFully(Piece[][] p) {
        for (int i = 0; i < p.length; i++) {
            Piece temp;
            for (int j = 1; j < p.length; j++) {
                for (int k = j; k > 0; k--) {
                    if (p[i][k].longitude < p[i][k - 1].longitude) {
                        temp = p[i][k];
                        p[i][k] = p[i][k - 1];
                        p[i][k - 1] = temp;
                    }
                }
            }
        }
        return p;
    }


}
