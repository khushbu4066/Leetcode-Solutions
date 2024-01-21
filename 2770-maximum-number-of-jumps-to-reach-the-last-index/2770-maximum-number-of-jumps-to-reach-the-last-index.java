class Solution {
    public int maximumJumps(int[] nums, int target) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        int res = findMaxJumps(0, target, dp, nums);
        return res == Integer.MIN_VALUE ? -1 : res;
    }

    public int findMaxJumps(int index, int target, int[] dp, int[] nums) {
        if (index == dp.length - 1) return dp[index] = 0;
        if (dp[index] != -1) return dp[index];
        int max = Integer.MIN_VALUE;
        for (int j = index + 1; j < dp.length; j++) {
            if (Math.abs((long) nums[j] - nums[index]) <= target) {
                max = Math.max(max, findMaxJumps(j, target, dp, nums));
            }
        }
        return dp[index] = max == Integer.MIN_VALUE ? max : max + 1;
    }
}