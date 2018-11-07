package Midterm1;

import CS61B.LinkedListDeque;

/**
 * Problem 6 Midterm 1 Practice Test 1
 */
public class Sandwich implements ToppableFoods{
    LinkedListDeque<Ingredient> ig;
    int amountofbread;

    public Sandwich() {
        ig = new LinkedListDeque<Ingredient>();
        this.amountofbread = 0;
    }

    public void addIngredient(Ingredient t) {
        if (ig.size() == 0 && t.name != "Bread") {
            throw new IllegalArgumentException("Need to have bread first?");
        }
        if (amountofbread >= 2) {
            throw new IllegalArgumentException("No more toppings allowed, you already have 2 breads");
        }
        if (t.name == "Bread") {
            amountofbread += 1;
        }
        ig.addLast(t);
    }

    public Ingredient removeIngredient(Ingredient t) {
        if (ig.size() == 0) {
            throw new IllegalArgumentException("Can’t remove nothing");
        }

        if (ig.get(ig.size() - 1).name != t.name) {
            throw new IllegalArgumentException("This is not the most recently added element");
        }
        if (t.name == "Bread") {
            amountofbread -= 1;
        }
        return ig.removeLast();
    }
}

