class Solution {
    public int solve(int[] nums, int index, int d, int[][] dp) {
        if (index >= nums.length)
            return (int) 1e9;
        
        // If only 1 day left, schedule all tasks on that day and return the maximum.
        if (d == 1) {
            int temp = 0;
            for (int i = index; i < nums.length; i++) {
                temp = Math.max(temp, nums[i]);
            }
            return temp;
        }

        if (dp[index][d] != -1)
            return dp[index][d];

        int res = Integer.MAX_VALUE;
        int curr = 0;

        for (int i = index; i < nums.length; i++) {
            curr = Math.max(curr, nums[i]);
            res = Math.min(res, curr + solve(nums, i + 1, d - 1, dp));
        }

        return dp[index][d] = res;
    }

    public int minDifficulty(int[] nums, int d) {
        if (nums.length < d)
            return -1;
        
        int[][] dp = new int[nums.length][d + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int ans = solve(nums, 0, d, dp);
        return ans;
    }
}