package Midterm1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit used to test Problem 6 Midterm 1 Practice Test 1
 */
public class PizzaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testAddBread() {
        Pizza p = new Pizza();
        Dough b = new Dough(2);
        p.addIngredient(b);
        p.removeIngredient(b);
        p.removeIngredient(b);
    }

    @Test
    public void testAddTopping() {
        Pizza p = new Pizza();
        Dough b = new Dough(2);
        p.addIngredient(b);
        Chicken c = new Chicken();
        p.addIngredient(c);
        assertEquals("chicken", p.removeIngredient(c).name);
    }

    @Test
    public void testRemoveTopping() {
        Pizza p = new Pizza();
        Dough b = new Dough(2);
        p.addIngredient(b);
        Chicken c = new Chicken();
        Chicken c2 = new Chicken();
        p.addIngredient(c);
        p.addIngredient(c2);
        assertEquals("chicken", p.removeIngredient(c).name);
    }

    @Test
    public void testAddSauce(){
        Pizza p= new Pizza();
        Dough b = new Dough(2);
        p.addIngredient(b);
        Marinara m = new Marinara();
        p.addIngredient(m);

    }

    @Test(expected = IllegalArgumentException.class)
    public void testTwoSaucesMax(){
        Pizza p= new Pizza();
        Dough b = new Dough(2);
        p.addIngredient(b);
        Marinara m = new Marinara();
        Marinara t = new Marinara();
        Marinara k = new Marinara();
        p.addIngredient(m);
        p.addIngredient(k);
        p.addIngredient(t);
    }

    @Test
    public void testRemoveSauce(){
        Pizza p= new Pizza();
        Dough b = new Dough(2);
        p.addIngredient(b);
        Marinara m = new Marinara();
        Marinara k = new Marinara();
        p.addIngredient(m);
        p.addIngredient(k);
        p.removeIngredient(k);
        p.addIngredient(k);
        Chicken c = new Chicken();
        p.addIngredient(c);
        assertTrue(true);
    }
}