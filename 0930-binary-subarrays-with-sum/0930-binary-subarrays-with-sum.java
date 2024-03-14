class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {
       int result = 0;
        int n = arr.length;
        
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum += arr[j];
                if(sum == goal){
                    result++;
                }
            }
            
        }
        return result;
    }
}