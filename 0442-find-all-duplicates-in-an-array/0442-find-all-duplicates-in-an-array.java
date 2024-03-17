class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i<nums.length; i++){
            int current = nums[i];
            if(set.contains(current)){
                list.add(current);
            }
            else{
                set.add(current);
            }
        }
        return list;
    }
}