package Chapter5;

/**
 * Used in Section 4.2 to show depth first search.
 */
public class DepthFirstDemo{
    private boolean[] marked;
    private int[] edgeTo;
    private int s;
    public DepthFirstDemo(Graph G, int s){
        marked = new boolean[G.V()];
        edgeTo = new int[G.V()];
        this.s = s;
        dfs(G,s);
    }
    private void dfs(Graph G, int v) {
        marked[v] = true;
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(G, w);
            }
        }
    }
}
