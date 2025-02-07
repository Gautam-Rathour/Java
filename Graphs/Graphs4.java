// // ==========================================================================================================
// // ==========================================================================================================

// Bellman Ford Algorithem  - ( Code ): --- 
// import java.util.*;
// public class Graphs4 {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge (int s, int d, int w) {
//             this.src = s; 
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) { 
//             graph[i] = new ArrayList<>(); 
//         }        

//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));

//         graph[1].add(new Edge(1, 2, -4));

//         graph[2].add(new Edge(2, 3, 2));
//         graph[3].add(new Edge(3, 4, 4));
//         graph[4].add(new Edge(4, 1, -1));
//     }
//     // Bellman Ford Algorithem : ---
//     public static void bellmanFord(ArrayList<Edge> graph[], int src) {
//         int dist[] = new int[graph.length];
//         for(int i=0; i<dist.length; i++) {
//             if(i != src) {
//                 dist[i] = Integer.MAX_VALUE;
//             }
//         }
//         int V = graph.length;
//         //algo
//         for(int i=0; i<V-1; i++) {
//             //edges - O(E)
//             for(int j=0; j<graph.length; j++) {
//                 for(int k=0; k<graph[j].size(); k++) {
//                     Edge e = graph[j].get(k);
//                     // u, v, wt
//                     int u = e.src;
//                     int v = e.dest;
//                     int wt = e.wt;
//                     // relaxation
//                     if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
//                         dist[v] = dist[u] + wt;
//                     }
//                 }
//             }
//         }
//         // print 
//         for(int i=0; i<graph.length; i++) {
//             System.out.print(dist[i] + " ");
//         }
//         System.out.println();
//      }

//     public static void main(String args[]) {
//         int V = 5;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         bellmanFord(graph, 0);
//     }
// }

// ==========================================================================================================
// ==========================================================================================================

// // Bellman Ford Algorithem  - ( Code ): --- ( II method )

// import java.util.*;
// public class Graphs4 {
//     static class Edge {
//         int src;
//         int dest;
//         int wt;

//         public Edge (int s, int d, int w) {
//             this.src = s; 
//             this.dest = d;
//             this.wt = w;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph) {      
//         graph.add(new Edge(0, 1, 2));
//         graph.add(new Edge(0, 2, 4));
//         graph.add(new Edge(1, 2, -4));
//         graph.add(new Edge(2, 3, 2));
//         graph.add(new Edge(3, 4, 4));
//         graph.add(new Edge(4, 1, -1));
//     }
//     // Bellman Ford Algorithem : ---
//     public static void bellmanFord(ArrayList<Edge> graph, int src, int V) {
//         int dist[] = new int[V];
//         for(int i=0; i<dist.length; i++) {
//             if(i != src) {
//                 dist[i] = Integer.MAX_VALUE;
//             }
//         }
//         //algo
//         for(int i=0; i<V-1; i++) {
//             //edges - O(E)
//             for(int j=0; j<graph.size(); j++) { 
//                 Edge e = graph.get(j);
//                     // u, v, wt
//                     int u = e.src;
//                     int v = e.dest;
//                     int wt = e.wt;
//                     // relaxation
//                     if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
//                         dist[v] = dist[u] + wt;
//                     }
//                 }
//             }
//         // print 
//         for(int i=0; i<dist.length; i++) {
//             System.out.print(dist[i] + " ");
//         }
//         System.out.println();
//      }

//     public static void main(String args[]) {
//         int V = 5;
//         // ArrayList<Edge> graph[] = new ArrayList[V];
//         ArrayList<Edge> graph = new ArrayList<>();
//         createGraph(graph);

//         bellmanFord(graph, 0, V);
//     }
// }

// ==========================================================================================================
// ==========================================================================================================

// Minimum Spanning Tree  (MST) :  ----

import java.util.*;
public class Graphs4 {
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

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 2, 15));
        graph[2].add(new Edge(2, 2, 50));

        graph[3].add(new Edge(3, 2, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair> {
        int v;
        int cost;

        public Pair(int v, int c) {
            this.v = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }
    public static void prims(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0; //MST Cost/total min Weight

        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.v]) {
                vis[curr.v] = true;
                finalCost += curr.cost;

                for(int i=0; i<graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    pq.add(new Pair(e.dest, e.wt));
                }
            }
        }
        System.out.println("Final (min) cost of MST = " + finalCost);
    }
    public static void main(String args[]) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        prims(graph);
    }
}