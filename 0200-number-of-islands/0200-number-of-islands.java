// class Solution {
    
//     private List<int[]> dir = new ArrayList<>();
    
//     Solution(){
        
//         dir.add(new int[]{1, 0});
//         dir.add(new int[]{-1, 0});
//         dir.add(new int[]{0, 1});
//         dir.add(new int[]{0, -1});
//     }
    
    
//     private void DFS(char[][] grid, int i, int j){
        
//         if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != '1')
//             return;
        
        
//         grid[i][j] = '$';
        
//         for(int[] p : dir ){
//             int i_ = i + p[0];
//             int j_ = j + p[1];
//             DFS(grid, i_, j_);
//         } 
//     }
    
    
//     public int numIslands(char[][] grid) {
        
//         if(grid.length == 0){
//             return 0;
//         }
        
//         int m = grid.length;
//         int n = grid[0].length;
//         int islands = 0;
        
//         for(int i = 0; i<m; i++){
//             for(int j = 0; j<n; j++){
//                 if(grid[i][j] == '1'){
//                     DFS(grid, i, j);
//                     islands += 1;
//                 }
//             }
//         }
//         return islands;
//     }
// }


//Approach (BFS & DFS)
//T.C : O(m*n)
//S.C : O(m*n)



class Solution {
    private int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    private boolean isSafe(char[][] grid, int i, int j) {
        return i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1';
    }
    
    private void bfs(char[][] grid, int i, int j, Queue<int[]> que) {
        que.offer(new int[]{i, j});
        grid[i][j] = '$';
        
        while (!que.isEmpty()) {
            int[] curr = que.poll();
            
            for (int[] p : dir) {
                int i_ = curr[0] + p[0];
                int j_ = curr[1] + p[1];
                
                if (isSafe(grid, i_, j_)) {
                    que.offer(new int[]{i_, j_});
                    grid[i_][j_] = '$';
                }
            }
        }
    }
    
    public int numIslands(char[][] grid) {
        if (grid.length == 0)
            return 0;
        
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        Queue<int[]> que = new ArrayDeque<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    bfs(grid, i, j, que);
                    count++;
                }
            }
        }
        
        return count;
    }
}