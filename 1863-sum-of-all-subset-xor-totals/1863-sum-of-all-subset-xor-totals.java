class Solution {
    public int subsetXORSum(int[] nums) {
        return sum(0, nums, 0);
    }
    
    public int sum(int i, int[]nums, int xor){
        if( i >= nums.length)
            return xor;
        return sum(i+1, nums, xor^nums[i]) + sum(i + 1, nums, xor);
    }
}


