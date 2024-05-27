class Solution {
    public int checkRecord(int n) {
        return numOfRecords(n, 1, 2, new Integer[n + 1][2][3]);
    }

    private int numOfRecords(int n, int a, int l, Integer[][][] dp) {
        if (n == 0) return 1;

        if (dp[n][a][l] != null) return dp[n][a][l];
        int mod = 1_000_000_007;

        int count = numOfRecords(n - 1, a, 2, dp);
        if (a == 1) count = (count + numOfRecords(n - 1, 0, 2, dp)) % mod;
        if (l > 0) count = (count + numOfRecords(n - 1, a, l - 1, dp)) % mod;

        return dp[n][a][l] = count;
    }
}