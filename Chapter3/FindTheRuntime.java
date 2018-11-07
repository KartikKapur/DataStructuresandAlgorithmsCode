package Chapter3;

/**
 * Chapter 3 find the runtime problems
 */
public class FindTheRuntime {

    /*
    Runs in O(2^(n)) time.
    We start off with an int n. At each layer, the work done is constant. However, each function call returns 2 more
    function calls. This makes the nodes per layer equal to 2^(i). We know that that there are a total of n steps because
    n decreases by 1 each step. Plugging this into our summation, we get ∑_{i=0}^{n} 1 * 2^(i)  = O(2^(n))
     */
    public int recursFib(int n) {
        if (n <= 1) {
            return n;
        }
        return recursFib(n - 1) + recursFib(n - 1);
    }


    /*
    Runs in Ω(N), O(N^(2)) time
    We see that N is equal to the length of grubbart. The first for loop runs a total of N times. The second for loop
    runs in relation to the first for loop. It is important to realize that there is a best and worst case in this code-
    item j and i in grubbart could be equal as the first element (best case) or they could never be equal (worst case).
    In the best case, the 2nd for loop is constant time each time- only one iteration, so the function would run in O(N).
    In the worst case, the the loop, in total, would run N - 1 + N -2 + N -3 +...+1 or it could be rewritten as 1+ 2+ 3+...+N-1
    which simplifies to O(N^(2))
    */
    static int yumGrub(int[] grubbart) {
        int N = grubbart.length;
        int chug = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j += 1) {
                if (grubbart[j] == grubbart[i]) {
                    chug++;
                    break;
                }
            }
        }
        return chug;
    }


    /*
    Runs in O(timon + pumba*√pumba) time.
    The first loop works a total of $timon$ times. This occurs regardless of what else is happening, and
    it can never terminate early. The inner loop runs only when the i value would be less than √{pumba. For each time
    this occurs, the work done by this loop would be upper bounded by n.
     */
    public void lion(int timon, int pumba) {
        for (int zazu = 0; zazu < timon; zazu++) {
            int mufasa = zazu * zazu;
            while (mufasa <= pumba) {
                System.out.print("Hakuna Matata");
                mufasa += 1;
            }
        }
    }
}
