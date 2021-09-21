public class AdjacencyMatrixDirected {
    // Adjacency matrix representation for directed graph
    int vertexCount;
    int matrix[][];

    AdjacencyMatrixDirected(int vertexCount) {
        this.vertexCount = vertexCount;
        matrix = new int[vertexCount][vertexCount];
    }

    // Function to add an edge to graph
    public void addEdgeInMatrix(int source, int destination) {
        matrix[source][destination] = 1;
    }

    // Function to delete an edge from source to destination
    public void deleteEdgeInMatrix(int source, int destination) {
        matrix[source][destination] = 0;
    }

    // Utility function to print a graph
    public void printGraph() {
        System.out.println("Representation of Graph in the form of Adjacency Matrix: ");
        for (int i = 0; i <= vertexCount; i++) {
            for (int j = 0; j <= vertexCount; j++) {
                System.out.print(matrix[i][j] + "   ");
            }

            System.out.println();
        }

        for (int i = 0; i < vertexCount; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < vertexCount; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        AdjacencyMatrixDirected adj = new AdjacencyMatrixDirected(7);
        // Adding an edge from node 1 to 2
        // Path from 1 to 2 exists but not from 2 to 1
        adj.addEdgeInMatrix(1, 2);

        adj.addEdgeInMatrix(3, 2);
        adj.addEdgeInMatrix(4, 3);
        adj.addEdgeInMatrix(1, 4);
        adj.addEdgeInMatrix(5, 3);
        adj.addEdgeInMatrix(6, 5);
        adj.addEdgeInMatrix(7, 6);
        adj.addEdgeInMatrix(7, 1);
        adj.printGraph();

    }

}
