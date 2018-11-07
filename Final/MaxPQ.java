package Final;

import java.util.Comparator;

/**
 * Problem 10
 */
public class MaxPQ {
    private Integer[] pq;
    private int size;

    MaxPQ() {
        pq = new Integer[10];
    }

    void insert(int x) {
        if (size == pq.length - 1) {
            resize(2 * pq.length);
        }
        size++;
        pq[size] = -x;
        swim(size);
    }

    Integer max() {
        return -pq[1];
    }

    Integer delMax() {
        Integer max = pq[1];
        pq[1] = pq[size--];
        sink(1);
        pq[size + 1] = null;
        if ((size > 0) && (size == (pq.length - 1) / 4)) {
            resize(pq.length / 2);
        }
        return -max;
    }

    int size() {
        return size;
    }

    private void swim(int k) {
        while (k > 1 && (((int) pq[k / 2]) > (pq[k]))) {
            Integer temp = pq[k];
            pq[k] = pq[k / 2];
            pq[k / 2] = temp;
        }
    }

    private void sink(int k) {
        if (size == 1) {
            return;
        }
        while (2 * k <= size) {
            int j = 2 * k;
            if (j < size && (int) pq[j] > (int) (pq[j + 1])) {
                j++;
            }

            if ( pq[k] < (pq[j])) {
                break;
            }
            Integer temp = pq[k];
            pq[k] = pq[j];
            pq[j] = temp;
            k = j;
        }
    }

    private void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for (int i = 1; i <= size; i++) {
            temp[i] = pq[i];
        }
        pq = temp;
    }

}
