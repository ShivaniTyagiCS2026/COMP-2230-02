# Graph Lab 10: Undirected Graph Adjacency Matrix

## Overview
This lab demonstrates how to represent graphs using adjacency matrices and adjacency lists in Java. The examples include:
- undirected graph as an adjacency matrix,
- directed graph as an adjacency matrix,
- undirected graph as an adjacency list,
- directed graph as an adjacency list.

## Files
- `UndirectedGraphAdjacencyMatrix.java` - Builds an adjacency matrix for a small undirected graph and prints it.
![alt text](https://media.geeksforgeeks.org/wp-content/uploads/20251028181828547875/1-.webp)
- `DirectedGraphAdjacencyMatrix.java` - Builds an adjacency matrix for a small directed graph and prints it.
![alt text](https://media.geeksforgeeks.org/wp-content/uploads/20251028181904555921/file.webp)
- `UndirectedGraphAdjacencyList.java` - Builds an adjacency list for a small undirected graph and prints it.
![alt text](https://media.geeksforgeeks.org/wp-content/uploads/20251028181956953251/file.webp)
- `DirectedGraphAdjacencyList.java` - Builds an adjacency list for a small directed graph and prints it.
![alt text](https://media.geeksforgeeks.org/wp-content/uploads/20251028182030033227/file.webp)
## Undirected Graph Example
Vertices: `0`, `1`, `2`
Edges:
- `0 - 1`
- `0 - 2`
- `1 - 2`

## Directed Graph Example
Vertices: `0`, `1`, `2`
Edges:
- `1 -> 0`
- `2 -> 0`
- `1 -> 2`

## Undirected Adjacency List Example
Vertices: `0`, `1`, `2`
Adjacency list:
- `0: 1 2`
- `1: 0 2`
- `2: 0 1`

## Directed Adjacency List Example
Vertices: `0`, `1`, `2`
Adjacency list:
- `0:`
- `1: 0 2`
- `2: 0`

## Undirected Output
```
Adjacency Matrix Representation:
0 1 1 
1 0 1 
1 1 0 
```

## Directed Output
```
Adjacency Matrix Representation:
0 0 0 
1 0 1 
1 0 0 
```

## How it works
- `createGraph(int V, int[][] edges)` initializes a `V x V` matrix of zeros.
- For each undirected edge `(u, v)`, the undirected graph sets `mat[u][v] = 1` and `mat[v][u] = 1`.
- For each directed edge `(u, v)`, the directed graph sets only `mat[u][v] = 1`.
- The main methods print the matrix row by row.

## Run Exercise
1. Open each Java file in the lab folder:
   - `UndirectedGraphAdjacencyMatrix.java`
   - `DirectedGraphAdjacencyMatrix.java`
   - `UndirectedGraphAdjacencyList.java`
   - `DirectedGraphAdjacencyList.java`
2. Run the program and verify the printed output matches the expected graph structure.
3. Modify one graph by adding a new vertex or a new edge, then rerun to see how the representation changes.
4. Compare the adjacency matrix and adjacency list outputs for the same undirected graph.
5. Answer:
   - Which representation is easier to update for sparse graphs?
   - Which representation is easier to read for dense graphs?
   - How does direction affect the stored edges?
