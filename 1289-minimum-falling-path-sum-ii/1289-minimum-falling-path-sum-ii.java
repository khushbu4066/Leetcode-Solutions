class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int dp[][] = new int[n][n];

        for(int i=0; i<n; i++){
            dp[0][i] = grid[0][i];
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<n; j++){
                int k = 0, min = Integer.MAX_VALUE;
                while(k < n){
                    if(k != j)  min = Math.min(min, dp[i-1][k]);
                    k++;
                }
                dp[i][j] = min + grid[i][j];
            }
        }

        // for(int[] a1 : dp){
        //     for(int l : a1){
        //         System.out.print(l + " ");
        //     }
        //     System.out.println();
        // }

        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            ans = Math.min(ans, dp[n-1][i]);
        }

        return ans;
    }
}