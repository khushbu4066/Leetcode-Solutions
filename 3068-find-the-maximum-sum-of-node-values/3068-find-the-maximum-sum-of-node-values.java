class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        
        int[] delta = new int[nums.length];

        for (int i=0; i<nums.length; i++) 
            delta[i] = (nums[i] ^ k) - nums[i];

        Arrays.sort(delta);

        long res = 0;

        for (int val : nums) res += val;

        for (int i=delta.length-1; i>0; i -= 2) {

            int pathSum = delta[i] + delta[i-1];

            if (pathSum < 0) break;
            res += pathSum;
        }

        return res;
    }
}