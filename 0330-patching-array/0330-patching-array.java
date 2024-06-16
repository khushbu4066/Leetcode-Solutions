class Solution {
    public int minPatches(int[] nums, int n) {
        long sumFormed = 0;
        long expectedSum = 1;
        int patches = 0;
        int m = nums.length;
        int i = 0;
        while(sumFormed < n){
            if(sumFormed >= expectedSum){
                expectedSum = sumFormed+1;
            }else {
                if(i < m && nums[i] <= expectedSum){
                    sumFormed += nums[i];
                    i++;
                }else {
                    patches++;
                    sumFormed += expectedSum;
                }
            }
        }
        return patches;
    }
}