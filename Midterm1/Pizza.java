package Midterm1;

import CS61B.LinkedListDeque;

/**
 * Problem 6 Midterm 1 Practice Test 1
 */
public class Pizza implements ToppableFoods {
    LinkedListDeque<Ingredient> ig;
    int numberOfSauces;
    boolean topping;

    public Pizza() {
        ig = new LinkedListDeque<Ingredient>();
        numberOfSauces = 0;
        topping = false;
    }

    public void addIngredient(Ingredient t) {
        if (ig.size() == 0 && t.name != "Dough") {
            throw new IllegalArgumentException("Can’t add to nothing");
        }
        if (t instanceof Saucy && numberOfSauces >= 2) {
            throw new IllegalArgumentException("Too many sauces");
        }
        if (t instanceof Saucy && (ig.get(ig.size() - 1) instanceof Topping) && (ig.get(ig.size() - 1).name != "Dough")) {
            throw new IllegalArgumentException("Can't put a sauce after a topping");
        }

        if (t instanceof Saucy) {
            numberOfSauces++;
        }
        ig.addLast(t);
    }

    public Ingredient removeIngredient(Ingredient t) {
        if (ig.size() == 0) {
            throw new IllegalArgumentException("There’s nothing to remove");
        }
        if (t.name != ig.get(ig.size() - 1).name) {
            throw new IllegalArgumentException("This is not the most recently added element");
        }
        if (t instanceof Saucy) {
            numberOfSauces -= 1;
        }
        return ig.removeLast();
    }
}

