package Chapter2;

/**
 * This is a naive IntList class with a sentinel node. The front and back pointers
 * have purposely not been optimized as to not give away too much for the 1st project
 * of CS 61B
 */
public class IntList {
    private Node sentinel;
    private int size;

    IntList() {
        sentinel = new Node(101, null);
        size = 0;
    }

    public class Node {
        int item;
        Node next;

        public Node(int i, Node n) {
            item = i;
            next = n;
        }
    }

    public void addFirst(int x) {
        size++;
        Node n = new Node(x, sentinel.next);
        sentinel.next = n;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        size++;
        Node p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(x, null);
    }

    public int getLast() {
        Node p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        return p.item;
    }

    public int size() {
        return size;
    }

    public boolean isPalindrome() {
        IntList reversed = new IntList();
        Node a = this.sentinel.next;
        while (a != null) {
            reversed.addFirst(a.item);
            a = a.next;
        }
        a = this.sentinel.next;
        Node b = reversed.sentinel.next;
        while( a != null){
            if(a.item != b.item){
                return false;
            }
            b = b.next;
            a = a.next;
        }
        return true;
    }
}
