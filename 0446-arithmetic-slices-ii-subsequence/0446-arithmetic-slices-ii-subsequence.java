class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int res = 0;
        HashMap<Integer,Integer>[] hmap = new HashMap[n];
        for(int i=0; i<n; i++){
            hmap[i] = new HashMap<>();
        }
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                long difD = (long)nums[i]-nums[j];
                if(difD >= Integer.MAX_VALUE || difD <= Integer.MIN_VALUE) continue;
                int dif = (int) difD;
                hmap[i].put(dif,hmap[i].getOrDefault(dif,0)+1);
                if(hmap[j].containsKey(dif)==true){
                    hmap[i].put(dif,hmap[i].get(dif)+hmap[j].get(dif));
                    res += hmap[j].get(dif);
                }
            }
        }
        return res;
    }
}