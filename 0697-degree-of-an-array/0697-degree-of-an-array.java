class Solution {
    public int findShortestSubArray(int[] nums) {
    Map<Integer, Integer> numToFreq = new HashMap<Integer, Integer>();
    Map<Integer, Integer> numToFirst = new HashMap<Integer, Integer>();

    int freq = 0, result = 0;
    for(int i = 0; i < nums.length; i++) {
        if( !numToFreq.containsKey(nums[i]) ) {
            numToFreq.put(nums[i], 1);
            numToFirst.put(nums[i], i);
            if( freq == 0 ) {
                freq = 1;
                result = 1;
            }
        }
        else {
            int newFreq = numToFreq.get(nums[i]) + 1;
            numToFreq.put(nums[i], newFreq);        
            if( newFreq > freq ) {
                freq = newFreq;
                result = i - numToFirst.get(nums[i]) + 1;
            }
            else if( newFreq == freq ) {
                result = Math.min(result, i - numToFirst.get(nums[i]) + 1);
            }
        }
    }

    return result;
}
}