
// ========================================================================================================
// ========================================================================================================
// // Second Lecture  :  ---  ( 2 )

// // connected Components  :  ----
// import java.util.*;
// public class Graphs2 {
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

//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1, 1));
//         graph[0].add(new Edge(0, 1, 1));

//         graph[1].add(new Edge(1, 0, 1));
//         graph[1].add(new Edge(1, 3, 1));

//         graph[2].add(new Edge(2, 0, 1));
//         graph[2].add(new Edge(2, 4, 1));

//         graph[3].add(new Edge(3, 1, 1));
//         graph[3].add(new Edge(3, 4, 1));
//         graph[3].add(new Edge(3, 5, 1));

//         graph[4].add(new Edge(4, 2, 1));
//         graph[4].add(new Edge(4, 5, 1));
//         graph[4].add(new Edge(4, 1, 1));

//         graph[5].add(new Edge(5, 3, 1));
//         graph[5].add(new Edge(5, 4, 1));
//         graph[5].add(new Edge(5, 6, 1));

//         graph[5].add(new Edge(6, 5, 1));
//     }

//     public static void bfs(ArrayList<Edge>[] graph) {
//         boolean vis[] = new boolean[graph.length];
//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 bfsUtil(graph, vis);
//             }
//         }
//     }
//      //
//     public static void bfsUtil(ArrayList<Edge> graph[], boolean vis[]) { // O(V+E)
//         Queue<Integer> q = new LinkedList<>(); 
//         q.add(0); // source = 0

//         while(!q.isEmpty()) {
//             int curr = q.remove();

//             if(!vis[curr]) { // visit curr
//                 System.out.print(curr + " ");
//                 vis[curr] = true;
//                 for(int i=0; i<graph[curr].size(); i++) {
//                     Edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }
//             }
//         }
//     }

//     public static void dfs(ArrayList<Edge> graph[]) {
//         boolean vis[] = new boolean[graph.length];
//         for(int i=0; i<graph.length; i++) {
//             dfsUtil(graph, i, vis);
//         }
//     }
//     // DFS 
//     public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) {  // O(V+E)
//         //visit
//         System.out.print(curr + " ");
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if(!vis[e.dest]) {
//                 dfsUtil(graph, e.dest, vis);
//             }
//         }
//     }
//     public static void main(String args[]) {
//         /* 
//                 1 --- 3
//                /      | \
//               0       |  5 -- 6
//               \       | /
//                2 ---- 4
//          */
//         int V = 7;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         bfs(graph);
//     }
// }
// // ==========================================================================================================
// // ==========================================================================================================

// // Cycle Detection ( Undirected Graph ) - DFS

// import java.util.*;
// public class Graphs2 {
//     static class Edge {
//         int src ;
//         int dest;

//         public Edge (int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }
// static void createGraph(ArrayList<Edge> graph[]) {
//     for(int i=0; i<graph.length; i++) {
//         graph[i] = new ArrayList<>();
//     }

//     graph[0].add(new Edge(0, 1));
//     // graph[0].add(new Edge(0, 2));
//     graph[0].add(new Edge(0, 3));

//     graph[1].add(new Edge(1, 0));
//     graph[1].add(new Edge(1, 2));

//     // graph[2].add(new Edge(2, 0));
//     graph[2].add(new Edge(2, 1));

//     graph[3].add(new Edge(3, 0));
//     graph[3].add(new Edge(3, 4));

//     graph[4].add(new Edge(4, 3));
// }

// public static boolean detectCycle(ArrayList<Edge> [] graph) {  // O(V+E)
//     boolean vis[] = new boolean [graph.length];
//     for(int i=0; i<graph.length; i++) {
//         if(!vis[i]) {
//            if(detectCycleUtil(graph, vis, i, -1)) {
//             return true;
//             // cycle exists in one of the parts
//            }
//         }
//     }
//     return false;
// }

// public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
//     vis[curr] = true;

//     for(int i=0; i<graph[curr].size(); i++) {
//         Edge e = graph[curr].get(i);
//         //case3
//         if(!vis[e.dest]) {
//             if(detectCycleUtil(graph, vis, e.dest, curr)) {
//                 return true;
//             }
//         }
//         //case1
//         else if(vis[e.dest] && e.dest != par) {
//             return true;
//         }
//         //case 2 -> do nothing -> continue
//     }
//     return false;
// }
//     public static void main(String args[]) {
// /*
//                 0 --------- 3
//                /|           |
//               / |           |
//              1  | --------- 4
//               \ |           |
//                \|           |
//                 2
//  */
//         int V = 5;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         System.out.println(detectCycle(graph));
//     }
// }

// // ==========================================================================================================
// // ==========================================================================================================

// // Bipartite Graph  :  ---

// import java.util.*;
// class Graphs2 {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));

//         graph[1].add(new Edge(1, 0));
//         graph[1].add(new Edge(1, 3));

//         graph[2].add(new Edge(2, 0));
//         graph[2].add(new Edge(2, 4));

//         graph[3].add(new Edge(3, 1));
//         // graph[3].add(new Edge(3, 4));

//         graph[4].add(new Edge(4, 2));
//         // graph[4].add(new Edge(4, 3));
//     }

//     // Bipartite  
//     public static boolean isBipartite(ArrayList<Edge> graph[]) {  // O(V+E)
//         int col[] = new int [graph.length];
//         for(int i=0; i<col.length; i++) {
//             col[i] = -1; // no color
//         }

//         Queue<Integer> q = new LinkedList<>();
        
//         for(int i=0; i<graph.length; i++) {
//             if(col[i] == -1) { // BFS
//                 q.add(i);
//                 col[i] = 0; // yellow
//                 while(!q.isEmpty()) {
//                     int curr = q.remove();
//                     for(int j=0; j<graph[curr].size(); j++) {
//                         Edge e = graph[curr].get(j); //e.dest
//                         if(col[e.dest] == -1) {
//                             int nextCol = col[curr] == 0 ? 1 : 0;
//                             col[e.dest] = nextCol;
//                             q.add(e.dest);
//                         } else if(col[e.dest] == col[curr]) {
//                             return false; //NOT bipartit
//                         }
//                     }
//                 }
//             }
//         }
//         return true;
//     }
//     public static void main (String args[]) {
//         // If Graph doesn't have cycle -> BIPARTITE
//         /*
//           0 ------- 2
//           /        /
//          /        /
//         1 ----- 4
//          \     /
//           \   /
//             3
//         FALSE
//          */
//         int V = 5;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);
//         System.out.println(isBipartite(graph));
//     }
// }

// ==========================================================================================================
// ==========================================================================================================

// // Cycle Detection (Directed graph ) - DFS  :  -----

// import java.util.*;
// public class Graphs2 {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }
//     // // graph1 - true
//     // static void createGraph(ArrayList<Edge> graph[]) {
//     //     for(int i=0; i<graph.length; i++) {
//     //         graph[i] = new ArrayList<>();
//     //     }

//     //     graph[0].add(new Edge(0, 2));
//     //     graph[0].add(new Edge(1, 0));
//     //     graph[2].add(new Edge(2, 3));
//     //     graph[3].add(new Edge(3, 0));
//     // }

//     // // graph2 - false
//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 1));
//         graph[0].add(new Edge(0, 2));
//         graph[1].add(new Edge(1, 3));
//         graph[2].add(new Edge(2, 3));
//     }

//     public static boolean isCycle(ArrayList<Edge> graph[]) {
//         boolean vis[] = new boolean[graph.length];
//         boolean stack[] = new boolean[graph.length];

//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 if(isCycleUtil(graph, i, vis, stack)) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
    
//     // Is Cycle  
//     public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], boolean stack[]) {
//         vis[curr] = true;
//         stack[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if(stack[e.dest]) {  //Cycle
//                 return true;
//             }
//             if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
//                 return true;
//             }
//         }
//         stack[curr] = false;
//         return false;
//     }
//     public static void main(String args[]) {
//         int V = 4;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         System.out.println(isCycle(graph));
//     }
// }
// ==========================================================================================================
// ==========================================================================================================

// // Topological Sorting ( using DFS ) :  ----

// import java.util.*;
// public class Graphs2 {
//     static class Edge {
//         int src;
//         int dest;

//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//      }

//      static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 1));

//         graph[4].add(new Edge(4, 0));
//         graph[4].add(new Edge(4, 1));

//         graph[5].add(new Edge(5, 0));
//         graph[5].add(new Edge(5, 2));
//      }

//      public static void topSort(ArrayList<Edge> graph[]) {  // O(V+E)
//         boolean vis[] = new boolean [graph.length];
//         Stack<Integer> s = new Stack<>();

//         for(int i=0; i<graph.length; i++) {
//             if(!vis[i]) {
//                 topSortUtil(graph, i, vis, s);  //modified dfs
//             }
//         }

//         while(!s.isEmpty()) {
//             System.out.print(s.pop() + " ");
//         }
//      }

//      public static void topSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
//         vis[curr] = true;

//         for(int i=0; i<graph[curr].size(); i++) {
//             Edge e = graph[curr].get(i);
//             if(!vis[e.dest]) {
//                 topSortUtil(graph, e.dest, vis, s);
//             }
//         }
//         s.push(curr);
//      }
//     public static void main(String args[]) {
//         int V = 6;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

        
//         topSort(graph);
//     }
// }


// ==========================================================================================================
// ==========================================================================================================

// // 2.  Live Lecture  :  -----

// import java.util.*;
// public class Graphs {
//     static boolean cycleUsingBfs(int source, ArrayList<ArrayList<Integer>> adj, boolean isVisited[]) {

//         Queue <Integer> q = new LinkedList<>();
//         q.add( source );
//         isVisited[source] = true;

//         while(q.isEmpty() == false) {
//             int curr = q.remove();

//             for(int conn : adj.get(curr)) {
//                 if(isVisited[conn] == true) {
//                     //there is a cycle
//                     return true;
//                 } else {
//                     isVisited[conn] = true;
//                     q.add(conn);
//                 }
//             }
//         }
//         // no cycle
//         return false;
//     }

//     static boolean detect( ArrayList<ArrayList<Integer>> adj, booealn isVisited[]) {
//         int n = adj.size();
//         for(int i=0; i<n; i++) {
//             if(isVisited[i] == false) {

//                 boolean result = cycleUsingBfs(i, adj, isVisited);
//                 if(result == true) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]) {

//     }
// }

// ==========================================================================================================
// ==========================================================================================================
// ==========================================================================================================
// ==========================================================================================================
// ==========================================================================================================


// //           Lecture - 3  -----------


// Topological Sort using BFS  ( Kahns Algrothem ) : ---

// import java.util.*;
// public class Graphs2 {
//     static class Edge {
//         int src; 
//         int dest;

//         public Edge (int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 1));

//         graph[4].add(new Edge(4, 0));
//         graph[4].add(new Edge(4, 1));

//         graph[5].add(new Edge(5, 0));
//         graph[5].add(new Edge(5, 2));
//     }

//     public static void calcIndeg(ArrayList<Edge> graph[], int indeg[]) {
//         for(int i=0; i<graph.length; i++) {
//             int v = i;
//             for(int j=0; j<graph[v].size(); j++) {
//                 Edge e = graph[v].get(j);
//                 indeg[e.dest]++;
//             }
//         }
//     }

//     public static void topSort(ArrayList<Edge> graph[]) {
//         int indeg[] = new int[graph.length];
//         calcIndeg(graph, indeg);
//         Queue<Integer> q = new LinkedList<>();

//         for(int i=0; i<indeg.length; i++) {
//             if(indeg[i] == 0) {
//                 q.add(i);
//             }
//         }

//         // bfs
//         while(!q.isEmpty()) {
//             int curr = q.remove();
//             System.out.print(curr + " "); //topological sort print

//             for(int i=0; i<graph[curr].size(); i++) {
//                 Edge e = graph[curr].get(i);
//                 indeg[e.dest]--;
//                 if(indeg[e.dest] == 0) {
//                     q.add(e.dest);
//                 }
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String args[]) {
//         int V = 6;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         topSort(graph);
//     }
// }

// ==========================================================================================================
// ==========================================================================================================

// // All Paths from Source to Target  :  ----

// import java.util.*;
// public class Graphs2{
//     static class Edge {
//         int src; 
//         int dest;

//         public Edge (int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

//     static void createGraph(ArrayList<Edge> graph[]) {
//         for(int i=0; i<graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }

//         graph[0].add(new Edge(0, 3));
//         graph[2].add(new Edge(2, 3));

//         graph[3].add(new Edge(3, 1));

//         graph[4].add(new Edge(4, 0));
//         graph[4].add(new Edge(4, 1));

//         graph[5].add(new Edge(5, 0));
//         graph[5].add(new Edge(5, 2));
//     }
//     public static void printAllPath(ArrayList<Edge> graph[], int src, int dest, String path) {
//         if(src == dest) {
//             System.out.println(path + dest);
//             return;
//         }

//         for(int i=0; i<graph[src].size(); i++) {
//             Edge e = graph[src].get(i);
//             printAllPath(graph, e.dest, dest, path+src);
//         }
//     }
//     public static void main(String args[]) {
//         int V = 6;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         int src = 5, dest = 1;
//         printAllPath(graph, src, dest, " ");
//     }
// }

// ==========================================================================================================
// ==========================================================================================================

// //  Dijkstra's Algorithm (Code)  :  ---

// import java.util.*;
// public class Graphs2 {
//         static class Edge {
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

//         graph[1].add(new Edge(1, 3, 7));
//         graph[1].add(new Edge(1, 2, 1));

//         graph[2].add(new Edge(2, 4, 3));

//         graph[3].add(new Edge(3, 5, 1));

//         graph[4].add(new Edge(4, 3, 2));
//         graph[4].add(new Edge(4, 5, 5));
//     }
//     static class Pair implements Comparable<Pair> {
//         int n;
//         int path;

//         public Pair(int n, int path) {
//             this.n = n;
//             this.path = path;
//         }

//         @Override
//         public int compareTo(Pair p2) {
//             return this.path - p2.path;  // path based sorting for my pairs
//         }
//     }
//     public static void dijkstra(ArrayList<Edge> graph[], int src) {
//         int dist[] = new int[graph.length]; //dest[i] -> src
//         for(int i=0; i<graph.length; i++) {
//             if(i != src) {
//                 dist[i] = Integer.MAX_VALUE; // +infinity
//             }
//         }

//         boolean vis[] = new boolean[graph.length];
//         PriorityQueue<Pair> pq = new PriorityQueue<>();
//         pq.add(new Pair(src, 0));
//         // loop
//         while(!pq.isEmpty()) {
//             Pair curr = pq.remove();
//             if(!vis[curr.n]) {
//                 vis[curr.n] = true;
//                 //neighbours
//                 for(int i=0; i<graph[curr.n].size(); i++) {
//                     Edge e = graph[curr.n].get(i);
//                     int u = e.src;
//                     int v = e.dest;
//                     int wt = e.wt;

//                     if(dist[u] + wt < dist[v]) { // update distance of src to v;
//                         dist[v] = dist[u] + wt;
//                         pq.add(new Pair(v, dist[v]));
//                     }
//                 }
//             }
//         }

//         //print all source to vertices shortest dist
//         for(int i=0; i<dist.length; i++) {
//             System.out.print(dist[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int V = 6;
//         ArrayList<Edge> graph[] = new ArrayList[V];
//         createGraph(graph);

//         int src = 0;
//         dijkstra(graph, src);
//     }
// }

// // ==========================================================================================================
// // ==========================================================================================================
 
// //           Live  ----------  ( Lecture - 3)  --
// // Topological Sort : --

// import java.util.*;
// public class Graphs2 {
//     static ArrayList<Integer> topoSort( ArrayList<ArrayList<Integer>> adj ) {

//         int n = adj.size();
//         int indegree[] = new int [n];
//         for(int curr=0; curr<n; curr++) {
//             for(int conn : adj.get(curr)) {
//                 indegree[conn]++;
//             }
//         }
//         Queue<Integer> q = new LinkedList<>();
//         for(int i=0; i<n; i++) {
//             if(indegree[i] == 0) {
//                 q.add(i);
//             }
//         }

//         ArrayList<Integer> ans = new ArrayList<>();
//         while(!q.isEmpty()) {
//             int curr = q.remove();
//             ans.add(curr);
//             for(int conn : adj.get(curr)) {
//                 indegree[conn]--;
//                 if(indegree[conn] == 0) {
//                     q.add(conn);
//                 }
//             }
//         }
//         return ans;
//     }
//     public static void main(String args[]) {

//     }
// }

// // // ==========================================================================================================
// // // ==========================================================================================================
 

// import java.util.*;
// public class Graphs2 {
//     static boolean detectCycleInDirectedGraph( ArrayList<ArrayList<Integer>> adj ) {

//         int n = adj.size();
//         int indegree[] = new int [n];
//         for(int curr=0; curr<n; curr++) {
//             for(int conn : adj.get(curr)) {
//                 indegree[conn]++;
//             }
//         }
//         Queue<Integer> q = new LinkedList<>();
//         for(int i=0; i<n; i++) {
//             if(indegree[i] == 0) {
//                 q.add(i);
//             }
//         }

//         ArrayList<Integer> ans = new ArrayList<>();
//         while(!q.isEmpty()) {
//             int curr = q.remove();
//             ans.add(curr);
//             for(int conn : adj.get(curr)) {
//                 indegree[conn]--;
//                 if(indegree[conn] == 0) {
//                     q.add(conn);
//                 }
//             }
//         }
//         if(ans.size() == n ) { // No cycle
//             return false;
//         } else { // cycle Found
//             return true;
//         }
//     }
//     public static void main(String args[]) {

//     }
// }
// ==========================================================================================================
// ==========================================================================================================
 
// Sunday Live : -----
import java.util.*;
public DSU {
    int [] parent;
    int [] size;

    DSU(int n) {
        this.parent = new int[n];
        for(int idx=0; idx<n; idx++) {
            parent[idx] = idx;
        }

        this.weight = new int[n];
        for(int idx=0; idx<n; idx++) {
            weight[idx] = 1;
        }
    }

    // path compression
    int find(int idx) {
        if(parent[idx] == idx) return idx;
        return parent[idx] = find(parent[idx];)
    }

    // weight compression
    void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if(pa == pb) return;

        if(weight[pa] > weight[pb]) {
            parent[pb] = pa;
            weight[pa] += weight[pb];
        } else {
            parent[pa] = pb;
            weight[pb] += weight[pa];
        }
    }
}


public class Solution {
    public static void main(String args[]) {

    }
}
