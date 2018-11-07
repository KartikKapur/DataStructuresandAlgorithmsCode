package Chapter2;
import java.util.Comparator;
/*
The FatCat class is used in Section 2.6
Used to give an example of Comparables and Comparators
 */
class FatCat<T> implements Comparable<T>, Comparator<FatCat> {
    int weight;

    public FatCat(int weight) {
        this.weight = weight;
    }

    public int compareTo(T o) {
        if (!(o instanceof FatCat)) {
            return 1;
        }
        return this.weight - ((FatCat) o).weight;
    }

    public int compare(FatCat o1, FatCat o2) {
        return o1.weight - o2.weight;
    }
}