class Solution {
    
   public int solve(int[] dp, int n){
        
        if(n<=1) return n;
        
        if(dp[n] != -1){
             return dp[n];
        }
        
        return dp[n] = solve(dp, n-1) + solve(dp, n-2);
    }
    
    
     int fib(int n) {
        
        // if(n<=1) return n;
        // return fib(n-1)+fib(n-2);
        
       int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        
        return solve(dp, n);
    }
}