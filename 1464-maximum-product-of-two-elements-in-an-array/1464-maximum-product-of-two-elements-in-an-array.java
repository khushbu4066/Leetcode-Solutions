class Solution {
    public int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int currentProduct = (nums[i]-1)*(nums[j]-1);
                result = Math.max(result, currentProduct);
            }
        }
        return result;
        
    }
}
