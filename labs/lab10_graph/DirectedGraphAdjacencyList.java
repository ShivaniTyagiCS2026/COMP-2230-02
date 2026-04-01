import java.util.ArrayList;

public class DirectedGraphAdjacencyList {

    static ArrayList<ArrayList<Integer>> createGraph(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        // Add each directed edge to the adjacency list
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }
        return adj;
    }

    public static void main(String[] args) {
        int V = 3;

        // List of directed edges (u, v)
        int[][] edges = { {1, 0}, {1, 2}, {2, 0} };

        // Build the graph using edges
        ArrayList<ArrayList<Integer>> adj = createGraph(V, edges);

        System.out.println("Adjacency List Representation:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int j : adj.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
