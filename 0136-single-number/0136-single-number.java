class Solution {
    public int singleNumber(int[] nums) {
        // int  x = nums[0];
        // for(int i = 1; i<nums.length; i++)
        //     x = x^nums[i];
        // return x;
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int n = nums.length;
        for(int i = 0; i < n; i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int i = 0; i<n; i++){
            if(mp.get(nums[i])==1){
                return nums[i];
            }
        }
        return -1;
        }
}