package Final;

/**
 * Specific priority queue made for the use of practice final #4 and #6 "The Lavender
 * Leopard".
 */
public class PQ {
    private Node[] rooms;
    private int size;

    public PQ() {
        rooms = new Node[8];
        rooms[0] = null;
        size = 0;
    }

    boolean contains(Node n) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].r.order == n.r.order) {
                return true;
            }
        }
        return false;
    }

    boolean contains(Room r) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null && rooms[i].r.order == r.order) {
                return true;
            }
        }
        return false;
    }

    private static int leftIndex(int i) {
        return 2 * i;
    }

    private static int rightIndex(int i) {
        return 2 * i + 1;
    }

    private static int parentIndex(int i) {
        return i / 2;
    }

    private Node getNode(int index) {

        return rooms[index];
    }


    private void swap(int index1, int index2) {
        Node node1 = getNode(index1);
        Node node2 = getNode(index2);
        rooms[index1] = node2;
        rooms[index2] = node1;
    }


    private int min(int index1, int index2) {
        Node node1 = getNode(index1);
        Node node2 = getNode(index2);
        if (node1 == null) {
            return index2;
        } else if (node2 == null) {
            return index1;
        } else if (node1.myPriority < node2.myPriority) {
            return index1;
        } else {
            return index2;
        }
    }

    private void swim(int index) {
        while (index > 1 && rooms[index].myPriority < rooms[parentIndex(index)].myPriority) {
            swap(index, parentIndex(index));
            index = index / 2;
        }
    }

    private void sink(int index) {

        if (size == 1) {
            return;
        }
        double pri = rooms[index].myPriority;
        while (2 * index <= size) {
            int m = min(leftIndex(index), rightIndex(index));
            if (pri > rooms[m].myPriority) {
                swap(index, m);
                index = m;
            } else {
                break;
            }
        }
        return;
    }

    public void insert(Room r, double priority) {
        if (size + 1 == rooms.length) {
            resize(rooms.length * 3);
        }

        Node temp = new Node(r, priority);
        size++;
        rooms[size] = temp;
        swim(size);
    }

    public int size() {
        return size;
    }


    public Room removeMin() {
        if (size == 1) {
            Node temp = rooms[size];
            rooms[size] = null;
            size--;
            return temp.r;
        }
        swap(1, size);
        Node temp = rooms[size];
        rooms[size + 1] = null;
        if (size == 1) {
            sink(1);
            size--;
        } else {
            size--;
            if (size != 0) {
                sink(1);
            }
        }
        return temp.r;
    }


    public void changePriority(Node n, double priority) {
        int i = 1;
        while (i < size && n.r.order != rooms[i].r.order) {
            i++;
        }
        Node q = getNode(i);
        q.myPriority = priority;
        sink(i);
        swim(i);
        return;
    }

    public void changePriority(Room r, double priority) {
        int i = 1;
        while (i < size && r.order != rooms[i].r.order) {
            i++;
        }
        Node q = getNode(i);
        q.myPriority = priority;
        sink(i);
        swim(i);
        return;
    }


    private void resize(int capacity) {
        Node[] temp = new Node[capacity];
        for (int i = 1; i <= temp.length; i++) {
            temp[i] = rooms[i];
        }
        rooms = temp;
    }

}

