class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Map to store the first occurrence of a particular remainder
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1); // This handles the case where a valid subarray starts from index 0
        
        int runningSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            runningSum += nums[i];
            
            int remainder = runningSum % k;
            
            // Adjust negative remainders to positive ones
            if (remainder < 0) {
                remainder += k;
            }
            
            // If the remainder has been seen before
            if (remainderMap.containsKey(remainder)) {
                // Check if the length of the subarray is at least 2
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                // Store the index of the first occurrence of this remainder
                remainderMap.put(remainder, i);
            }
        }
        
        return false; // No valid subarray found
    }
}