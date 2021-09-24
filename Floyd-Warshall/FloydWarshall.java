
public class FloydWarshall {
    // Using a very large value for the infinity. Note that
    // Integer.MAX_VALUE can also be used for this purpose.
    final static int INF = 99999;
    // Time complexity: O(V^2) for initialization of D[][] and O(V^3) for finding
    // the shortest distance

    static void floydWarshall(int[][] graph, int vertexCount) {
        // The output matrix will be of the same dimensions as
        // the original matrix
        int[][] D = new int[vertexCount][vertexCount];

        // Initializing the output matrix with the same values as
        // the input graph
        for (int i = 0; i < vertexCount; i++) {
            for (int j = 0; j < vertexCount; j++) {
                D[i][j] = graph[i][j];
            }
        }

        // Main logic for floyd warshall algorithm. That is, if by taking k as the
        // the intermediate vertex in between the source, i, and destination, j, the
        // path length reduces, then D[i][j] will be equal to sum of D[i][k] and
        // D[k][j]. Three nested loops are used for this purpose, this makes the
        // overall time complexity O(V^3)
        for (int k = 0; k < vertexCount; k++) {
            for (int i = 0; i < vertexCount; i++) {
                for (int j = 0; j < vertexCount; j++) {
                    if (D[i][k] + D[k][j] < D[i][j]) {
                        D[i][j] = D[i][k] + D[k][j];
                    }
                }
            }
        }
        // Calling the utility function printMatrix such that the output matrix is
        // printed
        printMatrix(D);
    }

    // A utility function to print a matrix
    // Time complexity: O(V^2)
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Adjacency matrix of the graph
        int graph[][] = { { 0, 3, INF, 7 }, { 8, 0, 2, INF }, { 5, INF, 0, INF }, { 2, INF, INF, 0 } };
        System.out.println("Printing the original graph");
        printMatrix(graph);
        System.out.println("\nPrinting the graph after applying Floyd's warshall algorithm");
        floydWarshall(graph, graph.length);
    }
}
