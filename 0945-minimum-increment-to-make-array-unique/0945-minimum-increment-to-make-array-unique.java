class Solution {
    public int minIncrementForUnique(int[] nums) 
    {
        Arrays.sort(nums);
        int ans=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                int val=nums[i];
                nums[i]=nums[i-1]+1;
                ans=ans+nums[i]-val;
            }
        }
        return ans;
        
    }
}