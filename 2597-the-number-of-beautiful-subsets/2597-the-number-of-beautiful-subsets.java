class Solution {
    static int count = 0;

    public int beautifulSubsets(int[] nums, int k) {
        Arrays.sort(nums);
        return findBeautifulSubset(nums, 0, k, new HashSet<Integer>());
                       
    }
    private int findBeautifulSubset(int[]nums, int ind, int k, Set<Integer> set)
    {
        
        if(ind == nums.length)
            return set.isEmpty() ? 0 : 1;
        
        int count = findBeautifulSubset(nums, ind+1, k, set);
        if(set.contains(nums[ind] - k)) return count;

        set.add(nums[ind]);
        count += findBeautifulSubset(nums, ind+1, k, set);
        set.remove(nums[ind]);
        return count;        
    }


}