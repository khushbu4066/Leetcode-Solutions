class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int count=0,sum=0,rem;
        int md[]=new int[k];
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            rem=sum%k;
            if(rem<0)
            rem+=k;
            md[rem]++;
        }
        for(int i=0;i<k;i++)
        {
            if(md[i]>1)
            count+=(md[i]*(md[i]-1))/2;
        }
        count+=md[0];
        return count;
    }
}