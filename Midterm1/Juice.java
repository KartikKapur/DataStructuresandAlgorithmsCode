package Midterm1;

/**
 * Problem 1 on Midterm 1 Practice Test 1
 */
public class Juice {
    public OJ o1;
    public static OJ o2;

    Juice() {
        o1 = new OJ(1, 2);
        o1.z = new OJ(5, 6);
        o2 = new OJ(3, 4);
        o2.z = new OJ(7, 8);
        pulpify();
        vitaminSeed();
        appleImposter();
    }

    public void pulpify() {
        o1.x[1] = o2.x[1];
    }

    public void vitaminSeed() {
        o1.x[0] = o1.z.x[0];

        o2.x[0] = o2.z.x[1];
        o1.z = o2;
    }

    public void appleImposter() {
        o1.x[1] = o2.x[0];
        o2.x[0] = o1.x[1];
        o2.x[1] = o1.z.x[0];
    }
}

