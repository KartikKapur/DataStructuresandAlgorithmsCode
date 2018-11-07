package Chapter4;


import sun.text.normalizer.Trie;

import java.util.List;
import java.util.LinkedList;

/**
 * Created by kartikkapur on 12/16/17.
 */
public class StudentIDTrie {
    TrieNode root;
    int size;

    StudentIDTrie() {
        root = new TrieNode('~');
    }

    public boolean search(String id) {
        TrieNode curr = root;
        for (int i = 0; i < id.length(); i++) {
            int l = (int) id.charAt(i) - 48;
            if (curr.children[l] != null) {
                curr = curr.children[l];
            } else {
                return false;

            }
        }
        return true;
    }

    public void insert(String id) {
        TrieNode curr = root;
        for (int i = 0; i < id.length(); i++) {
            char digit = id.charAt(i);
            int l = (int) digit -48;
            if (curr.children[l] != null) {
                curr = curr.children[l];
            } else {
                curr.children[l] = new TrieNode(digit);
                curr = curr.children[l];
            }
        }
        curr.fullId = id;
        curr.studentID = true;
        size++;
    }

    public void resetTrie(){
        root = new TrieNode('~');
    }

    public LinkedList putInOrder(){
        LinkedList order = new LinkedList();
        orderHelper(root, order);
        return order;
    }
    private void orderHelper(TrieNode curr, LinkedList soFar){
        boolean flag = false;
        for(int i = 0; i < 10; i++){
            TrieNode child = curr.children[i];
            if(child != null){
                orderHelper(child, soFar);
                flag = true;
            }
        }
        if(!flag){
            soFar.add(curr.fullId);
        }
    }



    private class TrieNode {
        //Create the entry with size 10 as there are 10 possibel digits
        char elem;
        String fullId;
        TrieNode children[];
        boolean studentID;

        TrieNode(char elem) {
            this.elem = elem;
            children = new TrieNode[10];
        }

    }
}

