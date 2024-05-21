class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        getSubsets(0, nums, new ArrayList<>(), res);
        return res;
    }

    public void getSubsets(int idx, int[] nums, List<Integer> curr, List<List<Integer>> res){
        if(idx == nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }

        getSubsets(idx + 1, nums, curr, res);
        curr.add(nums[idx]);
        getSubsets(idx + 1, nums, curr, res);
        curr.remove(curr.size() - 1);
    }
}