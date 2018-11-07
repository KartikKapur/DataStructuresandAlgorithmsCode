package Midterm1;

/**
 * Problem 4 Midterm 1 Practice Test 1
 */
public class Thor implements Viking {
    public void breathe(){
        System.out.println("breathing noise");
    }
    public void attack(){
        System.out.println("fight on with my " + burliness + "men");
    }
    public boolean fly(){
        System.out.println("I am flying!!!");
        return true;
    }
    public void grunt(){
        System.out.println("arrggh");
    }
}

