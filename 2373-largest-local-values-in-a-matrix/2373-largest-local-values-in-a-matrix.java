class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int res[][]=new int[n-2][n-2];
        int max=0;
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                max=Math.max(grid[i][j],
                Math.max(grid[i-1][j-1],
                Math.max(grid[i-1][j],
                Math.max(grid[i-1][j+1],
                Math.max(grid[i][j-1],
                Math.max(grid[i][j+1],
                Math.max(grid[i+1][j-1],
                Math.max(grid[i+1][j],
                grid[i+1][j+1]))))))));
                res[i-1][j-1]=max;
            }
        }
        return res;
    }
}