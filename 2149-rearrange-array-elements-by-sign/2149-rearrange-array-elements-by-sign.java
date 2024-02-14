class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        
        int n = nums.length;
        int pi = 0;
        int ni = 1;
        
        int[] result = new int[n];
        
        for(int num: nums){
            if(num > 0){
                result[pi] = num;
                pi += 2;
            }
            else{
                result[ni] = num;
                ni += 2;
            }
        }
        return result;
    }
}