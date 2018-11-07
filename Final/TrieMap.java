package Final;

import java.util.LinkedList;

/**
 * Problem 10 on the final
 */
public class TrieMap {
    public class TrieNode {
        char c;
        boolean isWord = false;
        String word = null;
        int count = 0;
        TrieNode[] children = new TrieNode[26];

        TrieNode(char c) {
            this.c = c;
        }
    }

    TrieNode root = new TrieNode('$');

    public void addWord(String word) {
        TrieNode start = root;
        char[] characters = word.toLowerCase().toCharArray();
        for (char c : characters) {
            int index = 0;
            index = c - 'a';
            if (start.children[index] == null) {
                TrieNode newNode = new TrieNode(c);
                start.children[index] = newNode;
                start = newNode;
            } else {
                start = start.children[index];
            }
        }
        start.isWord = true;
        start.word = word;
        start.count++;
    }

    public boolean contains(String word) {
        if (word == null || word.isEmpty()) {
            return true;
        }
        char[] chars = word.toLowerCase().toCharArray();
        TrieNode start = root;
        boolean flag = true;
        for (char c : chars) {
            int index = c - 'a';
            if (start.children[index] == null) {
                flag = false;
            } else {
                start = start.children[index];
            }
        }
        return flag;
    }

    public LinkedList getAllWords(TrieNode start) {
        LinkedList list = new LinkedList();
        if (start.isWord) {
            list.add(start);
        }
        TrieNode[] node = start.children;
        TrieNode temp;
        for (int i = 0; i < node.length; i++) {
            temp = node[i];
            if (temp != null) {
                list.addAll(getAllWords(temp));
            }
        }
        return list;
    }

}

