class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        
        int[] mp = new int[nums.length + 1];
        
        ArrayList<List<Integer>>result = new ArrayList<>();
        
        for(int num:nums){
           int freq =  mp[num];
            
            if(freq == result.size()){
                result.add(new ArrayList<>());
            }
            result.get(freq).add(num);
            mp[num]++;
        }
        return result;
    }
}