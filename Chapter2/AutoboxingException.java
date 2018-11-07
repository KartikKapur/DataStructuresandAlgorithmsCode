package Chapter2;


import java.io.IOException;

/**
 * Class is used in Section 2.7 and 2.8
 * It is used to show when autoboxing works and when it does not
 * Also goes over throwing and catching various types of exceptions.
 */
public class AutoboxingException {
    public static void oinkos() throws IOException {
        throw new IOException("protein power");
    }

    public static void main(String[] args) {
        int[] testArr1 = new int[6];
        /*int[] testArr2= new Integer[6]; This line purposely does not compile as int arrays
        cannot be interchanged with Integer arrays.
          */
        try {
            int[] arr = new int[3];
            int index = 0;
            while (true) {
                arr[index] = index;
                System.out.print(index);
            }
        } catch (ArrayIndexOutOfBoundsException E) {
            System.out.print("Phew got out of there");
        } finally {
            System.out.print("I need a nap");
        }
    }


}
