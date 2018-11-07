package Final;

public class MedianHeap {
    private MinPQ top = new MinPQ();
    private MaxPQ bottom = new MaxPQ();

    public int median() {
        int minSize = top.size();
        int maxSize = bottom.size();
        if (minSize == 0 && maxSize == 0) {
            return 0;
        }
        if (minSize > maxSize) {
            return top.min();
        }
        if (minSize < maxSize) {
            return bottom.max();
        }
        return (top.min() + bottom.max()) / 2;
    }

    public int size() {
        return top.size() + bottom.size();
    }

    public void insert(int element) {
        int median = median();
        if (element > median) {
            top.insert(element);
        } else {
            bottom.insert(element);
        }
        balanceHeap();
    }

    private void balanceHeap() {
        int minSize = top.size();
        int maxSize = bottom.size();
        int tmp = 0;
        if (minSize > maxSize + 1) {
            tmp = top.delMin();
            bottom.insert(tmp);
        }
        if (maxSize > minSize + 1) {
            tmp = bottom.delMax();
            top.insert(tmp);
        }
    }
}