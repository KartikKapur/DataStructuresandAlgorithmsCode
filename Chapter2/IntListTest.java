package Chapter2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests for problems that use IntList in chapter 2.
 */
public class IntListTest {

    @Test
    public void smallIntList(){
        IntList i = new IntList();
        i.addFirst(1);
        i.addFirst(2);
        i.addFirst(1);
        assertTrue(i.isPalindrome());
    }
    @Test
    public void bigIntList(){
        IntList i = new IntList();
        i.addFirst(1);
        i.addFirst(2);
        i.addFirst(3);
        i.addFirst(4);
        i.addFirst(3);
        i.addFirst(2);
        i.addFirst(1);
        assertTrue(i.isPalindrome());
    }
    public void notPalindrome(){
        IntList i = new IntList();
        i.addFirst(1);
        i.addFirst(2);
        i.addFirst(3);
        i.addFirst(4);
        i.addFirst(4);
        i.addFirst(2);
        i.addFirst(1);
        assertFalse(i.isPalindrome());
    }
}
