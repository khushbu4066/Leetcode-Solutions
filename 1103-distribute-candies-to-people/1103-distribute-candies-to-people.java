class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people]; // Array length should be num_people
        int count = 1; // Counter to keep track of candies to distribute
        
        while (candies > 0) {
            for (int i = 0; i < num_people && candies > 0; i++) {
                // Distribute candies to each person
                ans[i] += Math.min(candies, count);
                candies -= count;
                count++;
            }
        }
        
        return ans;
    }
}
