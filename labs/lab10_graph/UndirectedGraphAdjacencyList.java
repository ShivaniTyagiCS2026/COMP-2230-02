import java.util.ArrayList;

public class UndirectedGraphAdjacencyList {

    static ArrayList<ArrayList<Integer>> createGraph(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        // Add each edge to the adjacency list
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
            // since the graph is undirected
            adj.get(v).add(u);
        }
        return adj;
    }

    public static void main(String[] args) {
        int V = 3;

        // List of edges (u, v)
        int[][] edges = { {0, 1}, {0, 2}, {1, 2} };

        // Build the graph using edges
        ArrayList<ArrayList<Integer>> adj = createGraph(V, edges);

        System.out.println("Adjacency List Representation:");
        for (int i = 0; i < V; i++) {
            // Print the vertex
            System.out.print(i + ": ");
            for (int j : adj.get(i)) {
                // Print its adjacent vertices
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
