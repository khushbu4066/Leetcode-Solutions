// class Solution {
//     public int climbStairs(int n) {
        
//         if(n==0 || n==1 || n==2)
//             return n;

//         int[] a = new int[n];
//         a[0] = 1;
//         a[1] = 2;

//         for(int i = 2; i<n; i++){
//          a[i]=a[i-1] + a[i-2];
//         }
//         return a[n-1];
//     }
// }


// class Solution {
//     public int climbStairs(int n) {
        
//         if(n==0 || n==1 || n==2)
//             return n;
        
//         // a[0] = 0;
//         // a[1] = 1;
//         // a[2] = 2;
        
//         int a = 1;
//         int b = 2; 
//         int c = 3;

//         // i ko nikalne le liye, you just need 1 phle and 2 phle - (i-1) and (i-2)
//         for(int i = 3; i<=n; i++){
//          c = b + a;
            
//             b = c;
//             a = temp_b;
//         }
//         return c;
//     }
// }

// // a = 0 (i-2)
// // b= 1 (i-1)
// // c = 2 (i)








// class Solution {
    
//     int solve(int n){
    
//     if(n<0) return 0;
//         if(n==0) return 1;
        
//         int one_step = solve(n-1);
//     int two_step = solve(n-2);
    
//     return one_step + two_step;
// }
    
//     public int climbStairs(int n) {
        
//        return solve(n);
// }
// }


// class Solution {
    
//     int[] dp;
    
//     int solve(int n){
    
//     if(n<0) return 0;
//     if(n == 0) return 1;
        
//     if(dp[n] != -1) return dp[n];
        
//         int one_step = solve(n-1);
//     int two_step = solve(n-2);
    
//     return dp[n] = one_step + two_step;
// }
    
//     public int climbStairs(int n) {
        
//         dp = new int[46];
//         Arrays.fill(dp, -1);
//        return solve(n);
// }
// }


class Solution {
    
    public int climbStairs(int n) {
        
       if( n == 0 || n == 1 || n == 2){
           return n;
       }
        
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        
        for(int i = 3; i<=n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}


