// Naive approave

// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int n = nums.length;
        
//         int maxSum = Integer.MIN_VALUE ;
        
//         for(int i = 0; i<n; i++){
//             for(int j = i; j<n; j++){
//                 int sum = 0;
                
//              for(int k = i; k<=j; k++){
//                  sum += nums[k];
//              }
                
//                maxSum = Math.max(maxSum, sum);
             
                
//             }
//         }
        
//         return maxSum;
//     }
// }

// Better

// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int n = nums.length;
        
//         int maxSum = Integer.MIN_VALUE ;
        
//         for(int i = 0; i<n; i++){
//             int sum = 0;
//             for(int j = i; j<n; j++){
//                 sum += nums[j];
//                maxSum = Math.max(maxSum, sum);
                
//             }
//         }
        
//         return maxSum;
//     }
// }

// Optimal approach using 1 loop
// class Solution {
//     public int maxSubArray(int[] nums) {
        
//         int n = nums.length;
        
//         int maxSum = Integer.MIN_VALUE ;
//         int sum = 0;
        
//         for(int i = 0; i<n; i++){
//                 sum += nums[i];
               
//             if(sum > maxSum){
//                 maxSum = sum;
//             }
//             if(sum < 0){
//                 sum = 0;
//             }
//         }
        
//         return maxSum;
//     }
// }


//Kadane algo

class Solution {
    public int maxSubArray(int[] nums) {
        
        int n = nums.length;
        
        int maxSum = Integer.MIN_VALUE ;
        int sum = 0;
        
        int start = 0;
        int ansStart = -1, ansEnd = -1;
        
        for(int i = 0; i<n; i++){
            
            if(sum == 0) start = i;
                sum += nums[i];
               
            if(sum > maxSum){
                maxSum = sum;
                
                ansStart = start;
                ansEnd = i;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        
        return maxSum;
    }
}