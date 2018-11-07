package Chapter2;

/**
 * Created by kartikkapur on 6/16/17.
 */
public class GGTryCatch {
    public static void main(String[] args) {
        try{
            char[] arr = new char[10];
            for(int i = 0; i < 2 * arr.length; i++)
                arr[i] = 'a';
        }
        catch(ArrayIndexOutOfBoundsException E){
            System.out.println("seeya");
        }
        catch(IndexOutOfBoundsException E){
            System.out.println("byebye");
        }
        catch(Exception E){
            System.out.println("outta here");
        }
        finally{
            System.out.println("GG");
        }
    }
}
