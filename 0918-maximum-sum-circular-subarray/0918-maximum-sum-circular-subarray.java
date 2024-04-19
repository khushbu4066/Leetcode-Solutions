class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        
        int n = arr.length;
        
        if(n == 1) return arr[0];
        
        int sum = 0; 
        for(int i = 0; i<n; i++){
            sum += arr[i];
        }
        
        int curr_max = arr[0], maxSoFar = arr[0], 
        curr_min = arr[0], minSoFar = arr[0];
        
        for(int i = 1; i<n; i++){
            
            curr_max = Math.max(curr_max + arr[i], arr[i]);
            maxSoFar = Math.max(curr_max, maxSoFar);
            
            curr_min = Math.min(curr_min + arr[i], arr[i]);
            minSoFar = Math.min(curr_min, minSoFar);
        }
        
        if(minSoFar == sum){
            return maxSoFar;
        }
        
        return Math.max(maxSoFar, sum - minSoFar);
    }
}