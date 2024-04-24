// class Solution {
//     int[] dp;
//     public int tribonacci(int n) {
//         dp = new int[n+1];
//         Arrays.fill(dp, -1);
//         return dfs(n);
//     }
//     int dfs(int n){
//         if(n == 0) return 0;
//         if(n == 1) return 1;
//         if(n == 2) return 1;
//         if(dp[n] == -1){
//             dp[n] = dfs(n-1) + dfs(n-2) + dfs(n-3);   
//         }
//         return dp[n];
//     }
// }


class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[40];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }
}