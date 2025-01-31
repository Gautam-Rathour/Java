// ========================================================================================================
// ========================================================================================================
// // Creating a Graph ( Adjacency List )  :  ----

// import java.util.*;
// public class Graphs {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     public static void main(String args[]) {
//         /*
//                 (5)
//            0 -------- 1
//                      / \
//                  (1)/   \(3)
//                    /     \
//                   2 ----- 3
//                   |   (1)
//               (2) |
//                   |
//                   4
//          */

//         int V = 5;
//         ArrayList<Edge> graph[] = new ArrayList[V]; // null -> empty arraylist

//         for(int i=0; i<V; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         // 0 - vertex
//         graph[0].add(new Edge(0, 1, 5));
//         //1 - vertex
//         graph[1].add(new Edge(1, 0, 5));
//         graph[1].add(new Edge(1, 2, 1));
//         graph[1].add(new Edge(1, 3, 3));

//         //2 - vertex
//         graph[2].add(new Edge(2, 1, 1));
//         graph[2].add(new Edge(2, 3, 1));
//         graph[2].add(new Edge(2, 4, 2));

//         //3 - vertex
//         graph[3].add(new Edge(3, 1, 3));
//         graph[3].add(new Edge(3, 2, 1));

//         //4 - vertex 
//         graph[4].add(new Edge(4, 2, 2));


//         //2's neighbors
//         for(int i=0; i<graph[2].size(); i++) {
//             Edge e = graph[2].get(i);  //src, dest, wt
//             System.out.println(e.dest);
//         }
//     }
// }

// ========================================================================================================
// ========================================================================================================
// DFS ( Depth First Search ) :  ---

import java.util.*;
public class Graphs {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 1, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[4].add(new Edge(4, 1, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[5].add(new Edge(6, 5, 1));
    }

    public static void bfs(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>(); 
        boolean vis[] = new boolean[graph.length];
        q.add(0); // source = 0

        while(!q.isEmpty()) {
            int curr = q.remove();

            if(!vis[curr]) { // visit curr
                System.out.print(curr + " ");
                vis[curr] = true;
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String args[]) {
        /* 
                1 --- 3
               /      | \
              0       |  5 -- 6
              \       | /
               2 ---- 4
         */

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        bfs(graph);
    }
}