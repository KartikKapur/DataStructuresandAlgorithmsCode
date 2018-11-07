package Midterm1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit used to test Problem 6 Midterm 1 Practice Test 1
 */
public class SandwichTest {
    @Test(expected = IllegalArgumentException.class)
    public void testAddBread() {
        Sandwich s = new Sandwich();
        Bread b = new Bread(10);
        s.addIngredient(b);
        s.removeIngredient(b);
        s.removeIngredient(b);
    }

    @Test
    public void testAddTopping() {
        Sandwich s = new Sandwich();
        Bread b = new Bread(10);
        s.addIngredient(b);
        Turkey t = new Turkey();
        Turkey t2 = new Turkey();
        s.addIngredient(t);
        s.addIngredient(t2);
        assertEquals("turkey", s.removeIngredient(t2).name);
    }

    @Test
    public void testRemoveTopping() {
        Sandwich s = new Sandwich();
        Bread b = new Bread(10);
        s.addIngredient(b);
        Turkey t = new Turkey();
        Chicken t2 = new Chicken();
        s.addIngredient(t);
        s.addIngredient(t2);
        assertEquals("chicken", s.removeIngredient(t2).name);
    }

    @Test
    public void testAddSauce(){
        Sandwich s = new Sandwich();
        Bread b = new Bread(10);
        s.addIngredient(b);
        Marinara m = new Marinara();
        s.addIngredient(m);
        assertEquals("marinara",s.removeIngredient(m).name);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testTwoSlices(){
        Sandwich s = new Sandwich();
        Bread b = new Bread(10);
        s.addIngredient(b);
        Bread b2 = new Bread(10);
        s.addIngredient(b2);
        Marinara m = new Marinara();
        s.addIngredient(m);
    }

    @Test
    public void testRemoveSlice(){
        Sandwich s = new Sandwich();
        Bread b = new Bread(10);
        s.addIngredient(b);
        Bread b2 = new Bread(10);
        s.addIngredient(b2);
        s.removeIngredient(b2);
        Mustard m = new Mustard();
        assertTrue(true);
    }
}
