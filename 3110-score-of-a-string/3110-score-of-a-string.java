
class Solution {
    public int scoreOfString(String s) {
        int n = s.length();
        int strScore = 0;
        for (int i = 1; i < n; i++) {
            strScore += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return strScore;
    }
}