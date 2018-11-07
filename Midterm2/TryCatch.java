package Midterm2;

/**
 * Problem 4 on Midterm 2
 */
public class TryCatch {

    public static void triedTooHard(String[] n){
        try{
            for(int i = 0; i < n.length + 1; i++){
                System.out.println(n[i].charAt(0));
            }}
        catch(NullPointerException E){
            System.out.println("Tried" + n.length + "hard");}
        catch(IndexOutOfBoundsException E){
            String[] t = new String[n.length+1];
            System.arraycopy(n, 0, t, 1, n.length);
            triedTooHard(t);
        }
        finally{
            System.out.println(n.length);}}
    public static void main(String[] args){
        triedTooHard(new String[] {"my ", "everything ", "my", "eternal"});
    }
}

