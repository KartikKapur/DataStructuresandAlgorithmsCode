package Midterm1;

/**
 * Problem 4 Midterm 1 Practice Test 1
 */
public interface Viking extends Norse{
    final static int burliness = 300;
    void attack();
    boolean fly();
    void grunt();
    default void grunt(String t){
        System.out.println(t + "ARRRRRGH");
    }

}

