package Chapter4;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;
/**
 * Created by kartikkapur on 12/17/17.
 */
public class TestStudentID {
    @Test
    public void testBasicInsert(){
        StudentIDTrie s = new StudentIDTrie();
        s.insert("1234567890123");
        assertTrue(s.search("1234567890123"));
    }

    @Test
    public void testComplexInsert(){
        StudentIDTrie s = new StudentIDTrie();
        s.insert("9111111111111");
        s.insert("1234567890123");
        assertTrue(s.search("1234567890123"));
        s.insert("1234567890124");
        assertTrue(s.search("1234567890124"));
        assertTrue(s.search("9111111111111"));

    }


    @Test
    public void testBasicOrdering(){
        StudentIDTrie s = new StudentIDTrie();
        s.insert("1234567890123");
        assertTrue(s.search("1234567890123"));
        s.insert("1234567890124");
        assertTrue(s.search("1234567890124"));
        LinkedList l = s.putInOrder();
        assertEquals("1234567890123", l.get(0));
        assertEquals("1234567890124", l.get(1));

    }

    @Test
    public void testComplexOrdering(){
        StudentIDTrie s = new StudentIDTrie();
        s.insert("9111111111111");
        s.insert("9111191111111");

        s.insert("1111111111211");
        s.insert("1111111111112");
        s.insert("1111111111111");
        LinkedList l = s.putInOrder();
        assertEquals("1111111111111", l.get(0));
        assertEquals("1111111111112", l.get(1));
        assertEquals("1111111111211", l.get(2));
        assertEquals("9111111111111", l.get(3));
        assertEquals("9111191111111", l.get(4));

    }


}
