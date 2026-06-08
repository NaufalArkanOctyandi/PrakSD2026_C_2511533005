package pekan9_2511533005;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GraphTraversal_2511533005 {
    private Map<String, List<String>> graph_3005 = new HashMap<>();

    // Menambahkan edge (graf tak berarah)
    public void addEdge(String node1_3005, String node2_3005) {
        graph_3005.putIfAbsent(node1_3005, new ArrayList<>());
        graph_3005.putIfAbsent(node2_3005, new ArrayList<>());
        graph_3005.get(node1_3005).add(node2_3005);
        graph_3005.get(node2_3005).add(node1_3005);
    }

    // Menampilkan graf awal
    public void printGraph() {
        System.out.println("Graf Awal (Adjacency List):");
        for (String node_3005 : graph_3005.keySet()) {
            System.out.print(node_3005 + " -> ");
            List<String> neighbors_3005 = graph_3005.get(node_3005);
            System.out.println(String.join(", ", neighbors_3005));
        }
        System.out.println();
    }

    // DFS rekursif
    public void dfs(String start_3005) {
        Set<String> visited_3005 = new HashSet<>();
        System.out.println("Penelusuran DFS:");
        dfsHelper(start_3005, visited_3005);
        System.out.println();
    }

    private void dfsHelper(String current_3005, Set<String> visited_3005) {
        if (visited_3005.contains(current_3005)) return;
        visited_3005.add(current_3005);
        System.out.print(current_3005 + " ");
        for (String neighbor_3005 : graph_3005.getOrDefault(current_3005, new ArrayList<>())) {
            dfsHelper(neighbor_3005, visited_3005);
        }
    }
        // BFS iteratif
        public void bfs(String start_3005) {
            Set<String> visited_3005 = new HashSet<>();
            Queue<String> queue_3005 = new LinkedList<>();
            queue_3005.add(start_3005);
            visited_3005.add(start_3005);
            System.out.println("Penelusuran BFS:");
            while (!queue_3005.isEmpty()) {
                String current_3005 = queue_3005.poll();
                System.out.print(current_3005 + " ");
                for (String neighbor_3005 : graph_3005.getOrDefault(current_3005, new ArrayList<>())) {
                    if (!visited_3005.contains(neighbor_3005)) {
                        queue_3005.add(neighbor_3005);
                        visited_3005.add(neighbor_3005);
                    }
                }
            }
            System.out.println();
        }

        // Main
        public static void main(String[] args) {
            GraphTraversal_2511533005 graph_3005 = new GraphTraversal_2511533005();

            // Contoh graf: A-B, A-C, B-D, B-E
            graph_3005.addEdge("A", "B");
            graph_3005.addEdge("A", "C");
            graph_3005.addEdge("B", "D");
            graph_3005.addEdge("B", "E");
            // Cetak graf awal
            System.out.println("Garf Awal adalah: ");
            graph_3005.printGraph();
            // Lakukan penelusuran
            graph_3005.dfs("A");
            graph_3005.bfs("A");
        }
    
  }