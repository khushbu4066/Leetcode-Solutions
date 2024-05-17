class Solution {
    public int findPairs(int[] nums, int k) {
        // Sort the array
        Arrays.sort(nums);
        // Set to store unique pairs
        Set<Pair> ans = new HashSet<>();
        
        int i = 0, j = 1;
        while (j < nums.length) {
            int diff = nums[j] - nums[i];
            
            if (diff == k && i != j) {
                ans.add(new Pair(nums[i], nums[j]));
                i++;
                j++;
            } else if (diff > k) {
                i++;
            } else {
                j++;
            }
            
            if (i == j) {
                j++;
            }
        }
        
        return ans.size();
    }
}