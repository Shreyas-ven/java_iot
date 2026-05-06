public class p5_adjacencyMatrix {

    private int vertices;
    private int[][] matrix;

    // Constructor
    public p5_adjacencyMatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    // Add edge (undirected graph)
    public void addEdge(int src, int dest) {
        matrix[src][dest] = 1;
        matrix[dest][src] = 1;
    }

    // Display adjacency matrix
    public void displayMatrix() {
        System.out.println("Adjacency Matrix:");

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p5_adjacencyMatrix graph = new p5_adjacencyMatrix(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.displayMatrix();
    }
}