package Midterm1;

/**
 * Problem 6 Midterm 1 Practice Test 1
 */
interface Deque<Item>{
        void addFirst(Item x);
        void addLast(Item x);
        boolean isEmpty();
        int size();
        void printDeque();
        Item get(int index);
        Item removeFirst();
        Item removeLast();
}
