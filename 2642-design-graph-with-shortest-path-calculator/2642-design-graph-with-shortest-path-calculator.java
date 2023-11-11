class Graph {

    class Pair{ //custom data type
        int  node,wt;
        Pair(  int node, int wt){
            this.node=node;
            this.wt=wt;
        }
    }


    int n;
    ArrayList<ArrayList<Pair>> adj;

    public Graph(int n, int[][] edges) {    //Need: fill global variables n and adj to use it in another funtion
        this.n=n;
        adj=new ArrayList();

        for(int i=0; i<n; i++)
           adj.add(new ArrayList());

        for(int i=0; i<edges.length; i++)
           adj.get(edges[i][0]).add(new Pair(edges[i][1],edges[i][2]));
       
    }
    
    public void addEdge(int[] edge) {   // Need: This funtion is used to add edge between two node
          adj.get(edge[0]).add(new Pair(edge[1],edge[2]));
    }
    
    public int shortestPath(int node1, int node2) { // use dijkstra's algo to find shortest route b/w src and dest. 
    // You are given with src , dest, adj, No. of nodes (n) use this vaiables to find shortest path.
        int[] dist=new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[node1]=0;

        PriorityQueue<Pair> q=new PriorityQueue<>((a ,b)-> a.wt-b.wt); 
        q.add(new Pair(node1,0));

        while(! q.isEmpty()){
            Pair curr=q.poll();
            int node=curr.node;
            int wt=curr.wt;

            if(node==node2)
            return wt;

            for(Pair t: adj.get(node)){
                int adjNode=t.node;
                int adjwt=t.wt;

                if(dist[adjNode]>wt+adjwt){
                    dist[adjNode]=wt+adjwt;
                    q.add(new Pair(adjNode,adjwt+wt));
                }
            }
        }
    return -1;
    }
}
/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */