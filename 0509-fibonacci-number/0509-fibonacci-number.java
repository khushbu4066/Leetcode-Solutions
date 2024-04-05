// class Solution {
    
//    public int solve(int[] dp, int n){
        
//         if(n<=1) return n;
        
//         if(dp[n] != -1){
//              return dp[n];
//         }
        
//         return dp[n] = solve(dp, n-1) + solve(dp, n-2);
//     }
    
    
//      int fib(int n) {
        
//         // if(n<=1) return n;
//         // return fib(n-1)+fib(n-2);
        
//        int[] dp = new int[n+1];
//         Arrays.fill(dp, -1);
        
//         return solve(dp, n);
//     }
// }

class Solution {
    
     int fib(int n) {
        
        if(n<=1) return n;
        // return fib(n-1)+fib(n-2);
        
       int[] dp = new int[n+1];
         Arrays.fill(dp, -1);
         
         dp[0] = 0;
         dp[1] = 1;
         
         for(int i = 2; i<=n; i++){
             dp[i] = dp[i-1] + dp[i-2];
         }
         
         return dp[n];
    }
}