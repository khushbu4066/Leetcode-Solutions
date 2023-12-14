class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length,m = grid[0].length;
        int rowOnes[] = new int[n];
        int colOnes[] = new int[m];
        int diff[][] = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 1){
                    rowOnes[i]++;
                    colOnes[j]++;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                diff[i][j] = rowOnes[i]+colOnes[j]-(n-rowOnes[i])-(m-colOnes[j]);
            }
        }
        return diff;
    }
}