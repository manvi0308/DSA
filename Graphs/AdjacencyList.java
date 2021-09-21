
// Adjacency List representation in Java
import java.util.*;

public class AdjacencyList {
    int vertexCount;

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int destination) {
        // Adding an edge from source to destination
        adj.get(source).add(destination);
        // Adding an edge from destination to source
        adj.get(destination).add(source);
    }

    // A utility function to delete an edge from source index of outer arraylist to
    // destination index of inner array list.
    static void deleteEdge(ArrayList<ArrayList<Integer>> adj, int source, int destination) {
        adj.get(source).remove(destination);

    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        System.out.println("Adjacency List representation of Graph: ");
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency List of vertex " + i);
            System.out.print(i + " -> ");
            for (int j = 0; j < adj.get(i).size(); j++)
                System.out.print(adj.get(i).get(j) + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Basically we are forming a graph with vertexCount vertices
        // To do that an ArrayList of ArrayLists is created and each outer
        // ArrayList will contain vertexCount elements. Each vertex will have
        // an ArrayList of vertices that are adjacent to it.
        int vertexCount = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(vertexCount);
        for (int i = 0; i < vertexCount; i++)
            adj.add(new ArrayList<Integer>());

        // Add edges to the graph

        // Adding an edge from 0 to 1
        addEdge(adj, 0, 1);

        // Adding an edge from 0 to 4
        addEdge(adj, 0, 4);

        // Adding an edge from 1 to 2
        addEdge(adj, 1, 2);

        // Adding an edge from 1 to 3
        addEdge(adj, 1, 3);

        // Adding an edge from 2 to 3
        addEdge(adj, 2, 3);

        // Adding an edge from 3 to 4
        addEdge(adj, 3, 4);
        printGraph(adj);


        System.out.println("After removing an edge from graph");
        deleteEdge(adj, 1, 2);
        printGraph(adj);

    }

}
