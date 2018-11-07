package Midterm2;

/**
 * Problem 1 on Midterm 1
 */
public class Human {
    int legs;
    int arms;

    // @Override This bit is wrong on purpose
    public boolean equals(Human no) {
        return legs == no.legs && arms == no.arms;
    }


}
