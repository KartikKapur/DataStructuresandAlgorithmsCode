package Final;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

/**
 * Made for problem 10
 */
public class TestTrieMap {
    @Test
    public void testTrie() {
        TrieMap trie = new TrieMap();
        trie.addWord("Java");
        trie.addWord("JavaOne");
        trie.addWord("JavaTwo");
        trie.addWord("JavaThree");
        trie.addWord("JavaFour");
        trie.addWord("JavaFive");
        trie.addWord("burden");
        trie.addWord("burger");
        trie.addWord("burp");
        trie.addWord("burper");
        assertTrue(trie.contains("Java"));
    }

    @Test
    public void testAdd() {
        TrieMap trie = new TrieMap();
        trie.addWord("Java");
        trie.addWord("Java");
        trie.addWord("Java");
        trie.addWord("Java");
        trie.addWord("Hello");
        LinkedList<TrieMap.TrieNode> l = trie.getAllWords(trie.root);
        assertEquals(1, l.get(0).count);
        assertEquals(4, l.get(1).count);
    }

    @Test
    public void testContains() {
        TrieMap trie = new TrieMap();
        trie.addWord("Java");
        trie.addWord("kartik");
        trie.addWord("hello");
        assertTrue(trie.contains("hello"));
        assertFalse(trie.contains("nah"));
    }


    public static boolean testCount(TrieMap t){
        LinkedList<TrieMap.TrieNode> words = t.getAllWords(t.root);
        for(TrieMap.TrieNode node : words){
            if ( node.count < 5){
            return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        TrieMap t = new TrieMap();
        t.addWord("hello");
        t.addWord("kartik");
        t.addWord("Java");
        t.addWord("kartik");
        t.addWord("kartik");
        t.addWord("kartik");
        t.addWord("kartik");
        t.addWord("kartik");
        testCount(t);
    }
}
