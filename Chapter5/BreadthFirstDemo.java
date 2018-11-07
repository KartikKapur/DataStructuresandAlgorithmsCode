package Chapter5;

import edu.princeton.cs.algs4.Queue;

/**
 * Used in Section 4.3 to teach Breadth-First Search.
 */
public class BreadthFirstDemo {
    private boolean[] marked;
    private int[] edgeTo;
    private final int s;

    public BreadthFirstDemo(Graph G, int s) {
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        bfs(G, s);
    }

    private void bfs(Graph G, int s) {
        Queue<Integer> q = new Queue<Integer>();
        marked[s] = true;
        q.enqueue(s);
        while (!q.isEmpty()) {
            int v = q.dequeue();
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    {
                        edgeTo[w] = v;
                        marked[w] = true;
                        q.enqueue(w);
                    }
                }
            }
        }
    }
}