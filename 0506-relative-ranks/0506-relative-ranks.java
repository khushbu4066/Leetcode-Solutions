
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        
        // Create a mapping of scores to their indices
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(score[i], i);
        }
        
        // Sort the scores array in descending order
        Arrays.sort(score);
        
        // Assign ranks based on positions in the sorted array
        for (int i = n - 1; i >= 0; i--) {
            int index = map.get(score[i]);
            if (i == n - 1) {
                result[index] = "Gold Medal";
            } else if (i == n - 2) {
                result[index] = "Silver Medal";
            } else if (i == n - 3) {
                result[index] = "Bronze Medal";
            } else {
                result[index] = String.valueOf(n - i);
            }
        }
        
        return result;
    }
}
