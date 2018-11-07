package Chapter2;

/**
 * Created by kartikkapur on 6/16/17.
 */
public class OG {
    int x;
    static int y;

    public OG(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        OG OG1 = new OG(10, 2);
        OG OG2 = new OG(0, 1);
        OG1.y = OG2.x;
        OG1.x = OG2.y;
    }
}
