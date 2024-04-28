class Solution {
    
    
    Map< Integer, List< Integer>> graph;
    Map< Integer, Integer> count;
    Map< Integer, Integer> res;
    int N;

    public int[] sumOfDistancesInTree( int N, int[][] edges){
        
        this.N = N;
        this.res = new HashMap<>();
        this.graph = new HashMap<>();
        this.count = new HashMap<>();

        for( int[] e : edges){
            
            graph.putIfAbsent( e[ 0], new ArrayList<>());
            graph.putIfAbsent( e[ 1], new ArrayList<>());
            graph.get( e[ 0]).add(e[ 1]);
            graph.get( e[ 1]).add(e[ 0]);
        }

        dfs1( 0, -1);
        dfs2( 0, -1);
        
        int[] result = new int[ N];
        for( int i = 0; i < N; i++) {
            result[ i] = res.get(i);
        }
        
        return result;
    }

    
    public void dfs1( int cur, int parent){
        
        count.put( cur, 1);
        res.put(cur, 0);
        
        for( int child : graph.getOrDefault( cur, new ArrayList<>())) {
            
            if( child != parent) {
                
                dfs1( child, cur);
                count.put( cur, count.get( cur) + count.get( child));
                res.put( cur, res.get( cur) + res.get( child) + count.get( child));
            }
        }
    }

    public void dfs2( int cur, int parent) {
        
        for( int child : graph.getOrDefault( cur, new ArrayList<>())){
            
            if( child != parent){
                
                res.put( child, res.get( cur) + N - 2 * count.get( child));
                dfs2( child, cur);
            }
        }
    }
}