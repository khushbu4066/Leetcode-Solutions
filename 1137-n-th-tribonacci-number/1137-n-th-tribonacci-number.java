class Solution {
    int[] dp;
    public int tribonacci(int n) {
        dp = new int[n+1];
        Arrays.fill(dp, -1);
        return dfs(n);
    }
    int dfs(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        if(dp[n] == -1){
            dp[n] = dfs(n-1) + dfs(n-2) + dfs(n-3);   
        }
        return dp[n];
    }
}