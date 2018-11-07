package Chapter2;

/**
 * Solution to Problem 1 of Section 2.12
 */
public class Paper {
    public static int thickness;
    public final char[] wordswritten;
    public static int amountofwords;
    private final int paperFriends;

    public Paper() {
        this.thickness = 1;
        wordswritten = new char[10];
        amountofwords = wordswritten.length;
        paperFriends = 4;
    }

    public void ICanWrite() {
        for (int i = 0; i < wordswritten.length; i++) {
            wordswritten[i] = 'a';
        }
    }

    public static void ICanWriteMore() {
        char[] temp = new char[amountofwords];
        for (int i = 0; i < amountofwords; i++) {
            /*temp[i] = wordswritten[i];} Errors out because wordswritten is an instance
            variable and you cannot access from a static context
                 */
        }
    }

    public void IWritetheMost(){
        char[] temp = new char[amountofwords];
        temp = wordswritten;
        /* wordswritten = temp; Even though the address is the same, you cannot ever attempt to change the bits
        * (Java is not as smart as you)*/
    }
}

