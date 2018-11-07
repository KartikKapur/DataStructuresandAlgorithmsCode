package Chapter5;

import java.util.LinkedList;

/**
 * Graph class used for the base of Chapter 4.
 *
 */
public class Graph {
    private int V;
    private int E;
    private LinkedList[] adj;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = new LinkedList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList();
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
}
