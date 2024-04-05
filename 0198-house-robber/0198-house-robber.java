// 1st step But tLE

// class Solution {

//     public int solve(int[] nums, int i, int n){

//         if(i >= n)
//         return 0;

//         int steal = nums[i] + solve(nums, i+2, n);
//         int skip = solve(nums, i+1, n);

//         return Math.max(steal, skip);
//     }


//     public int rob(int[] nums) {
        
//         int n = nums.length;
//         return solve(nums,0,n);
//     }
// }

// 2nd step  (1ST APPROACH)
// class Solution {
//     int t[];
//     public int solve(int[] nums, int i, int n){

//         if(i >= n)
//         return 0;

//         if(t[i] != -1)
//         return t[i];

//         int steal = nums[i] + solve(nums, i+2, n);
//         int skip = solve(nums, i+1, n);

//         return Math.max(steal, skip);
//     }



//     public int rob(int[] nums) {
        
//         int n = nums.length;
//         t = new int[101];
//         Arrays.fill(t, -1);
//         return solve(nums,0,n);
//     }
// }
//TLE



// 2ND APPROACH
//BOttom up 
// class Solution {
    
//     public int rob(int[] nums) {

//         int n = nums.length;
//         int[] t = new int[n+1];

//         if(n==1)
//         return nums[0];

//         t[0] = 0;
//         t[1] = nums[0];
        
//         //t[i] = maximum stolen money till i houses

//         for(int i = 2; i<=n; i++){
            
//             int steal = nums[i-1] + t[i-2];
//             int skip = t[i-1];

//             t[i] = Math.max(steal, skip);
//         }
//         return t[n];
//     }
// }


class Solution {
    
    int[] dp;
    
    int solve(int[] nums, int i, int n){
        if(i>= n)
            return 0;
        
        if(dp[i] != -1) return dp[i];
        
        int steal = nums[i] + solve(nums, i+2, n);
        int skip = solve(nums, i+1, n);
        
        return dp[i] = Math.max(steal, skip);
    }
    public int rob(int[] nums) {
        int n = nums.length;
        
        dp = new int[101];
        Arrays.fill(dp, -1);
        
        return solve(nums, 0, n);
    }
}




 

