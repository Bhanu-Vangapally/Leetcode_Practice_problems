// Last updated: 1/4/2026, 11:54:18 PM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int source, int destination) {
3        ArrayList<Edge> graph[] = new ArrayList[n];
4
5        for(int i = 0; i < graph.length; i++){
6            graph[i] = new ArrayList<>();
7        }
8
9        for (int i = 0; i < edges.length; i++) {
10            int src = edges[i][0];
11            int dest = edges[i][1];
12
13            graph[src].add(new Edge(src, dest));
14            graph[dest].add(new Edge(dest, src)); // undirected
15        }
16
17        boolean visited[] = new boolean[n];
18
19        return helper(graph, source, destination, visited);
20    }
21
22    public boolean helper(ArrayList<Edge> graph[], int src, int dest, boolean visited[]){
23        if(src == dest){
24            return true;
25        }
26
27        visited[src] = true;
28
29        for(int i = 0; i < graph[src].size(); i++){
30            Edge e = graph[src].get(i);
31
32            if(!visited[e.dest] && helper(graph, e.dest, dest, visited)){
33                return true;
34            }
35        }
36
37        return false;
38    }
39
40    public class Edge{
41        int src;
42        int dest;
43
44        public Edge(int src, int dest){
45            this.src = src;
46            this.dest = dest;
47        }
48    }
49}