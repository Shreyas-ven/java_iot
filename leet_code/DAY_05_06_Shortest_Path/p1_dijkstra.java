
import java.util.*;

public class p1_dijkstra {

    static final int INF = Integer.MAX_VALUE;

    // Function to perform Dijkstra's algorithm
    public static void dijkstra(int[][] graph, int src) {
        int V = graph.length;

        int[] dist = new int[V];        // shortest distance from source
        boolean[] visited = new boolean[V];

        // Initialize distances
        Arrays.fill(dist, INF);
        dist[src] = 0;

        // Min-heap priority queue (distance, node)
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.add(new int[]{0, src});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[1];

            if (visited[u]) continue;
            visited[u] = true;

            // Relaxation step
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !visited[v]) {
                    int newDist = dist[u] + graph[u][v];

                    if (newDist < dist[v]) {
                        dist[v] = newDist;
                        pq.add(new int[]{dist[v], v});
                    }
                }
            }
        }

        // Print shortest distances
        System.out.println("Vertex \t Distance from Source " + src);
        for (int i = 0; i < V; i++) {
            System.out.println(i + " \t\t " + dist[i]);
        }
    }

    public static void main(String[] args) {

        // Graph represented as adjacency matrix
        int[][] graph = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        int source = 0;
        dijkstra(graph, source);
    }
}