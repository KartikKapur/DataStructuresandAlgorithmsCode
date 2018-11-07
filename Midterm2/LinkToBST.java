package Midterm2;

/**
 * Created by kartikkapur on 11/4/17.
 */
import java.util.LinkedList;
public class LinkToBST {
    class TreeNode<T> {
        T item;
        TreeNode left, right;
        TreeNode(T item) {
            this.item = item;
            left = null;
            right = null;
        }
    }
    TreeNode LinkedListToBST(LinkedList l){
        return LinkedListToBST(l.size(), l);
    }

    /**
     *
     * @param n The amount of elements that you will be looking at this iteration of the function
     *          We shrink this amount by 1/2 each iteration and choose to either look at the left or
     *          right.
     * @param l The LinkedList being passed in. We remove the first element for each root; however,
     *          since we are going to the left most elements first, we will remove the correct item
     *          when we reach the root.
     * @return The root of our new Binary Search Tree.
     */
    TreeNode LinkedListToBST(int n, LinkedList l){
        if(n<=0){
            return null;
        }
        TreeNode left = LinkedListToBST(n /2 , l);
        TreeNode root = new TreeNode(l.removeFirst());
        TreeNode right = LinkedListToBST(n - n/2 - 1, l);
        root.left = left;
        root.right = right;
        return root;
    }
}