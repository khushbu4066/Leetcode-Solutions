class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int ans = Integer.MAX_VALUE;

        int[][] dp = new int[r][c];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        for(int i=0; i<c; i++) {
            ans = Math.min(ans, rec(0, i, matrix, dp));
        }
        return ans;
    }
    private int rec(int i, int j, int arr[][], int[][] dp) {
        if(i==arr.length) return 0;
        if(j<0 || j>=arr[0].length) return Integer.MAX_VALUE;

        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];

        int ops1 = rec(i+1, j-1, arr, dp);
        int ops2 = rec(i+1, j, arr, dp);
        int ops3 = rec(i+1, j+1, arr, dp);

        dp[i][j] = arr[i][j] + Math.min(ops1, Math.min(ops2, ops3));
        return dp[i][j];
    }
}