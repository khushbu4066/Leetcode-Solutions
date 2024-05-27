class Solution {
    public int specialArray(int[] nums) {
        int l=nums.length ;
        int v=0;
        for(int i=0;i<=l;i++){
            v=0;
            for(int j=0;j<l;j++){
                if(nums[j]>=i){
                    v++;
                }
            }
            if(v==i){
                return i;
            }
        }
    return -1;
    }
    
}
