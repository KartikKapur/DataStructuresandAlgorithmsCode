package Chapter5;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Used for the implementation of Dijkstras
 * Heavily inspired from Algorithms 4th edition by Robert Sedgewick and Kevin Wayne
 */
public class WeightedDiGraph {
    private int V;
    private int E;
    private Iterable<DirectedEdge>[] adj;

    public WeightedDiGraph(int V) {
        this.V = V;
        this.E = 0;
        adj = new LinkedList[V];
        for (int v = 0; v < V; v++)
            adj[v] = new LinkedList<DirectedEdge>();
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(DirectedEdge e) {
        ((LinkedList)adj[e.from()]).add(e);
        E++;
    }

    public Iterable<DirectedEdge> adj(int v) {
        return adj[v];
    }

    public Iterable<DirectedEdge> edges() {
        LinkedList l = new LinkedList<DirectedEdge>();
        for (int v = 0; v < V; v++)
            for (DirectedEdge e : adj[v])
                l.add(e);
        return l;
    }
}
