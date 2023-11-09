class Solution {
    public int countHomogenous(String s) {
        final int MOD = 1000000007;
        long count = 0;
        int consecutive = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
                count = (count + (long) consecutive * (consecutive + 1) / 2) % MOD;
                consecutive = 1;
            } else {
                consecutive++;
            }
        }
        return (int) count;
    }
}