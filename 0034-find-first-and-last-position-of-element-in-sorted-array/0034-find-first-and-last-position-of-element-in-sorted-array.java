class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        return new int[]{
        Lowerbound(nums, target),
        Upperbound(nums, target)
        };
    }
        
        public int Lowerbound(int[] nums, int target){
            
            int lo = 0, hi = nums.length-1;
            int ans = -1;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                if(nums[mid]>target){
                    hi = mid-1;
                }
                else if(nums[mid]<target)
                {
                    lo = mid+1;
                }
                else{
                   ans = mid;
                    hi = mid-1;
                }
            }
            return ans;
            
        }
        
        public int Upperbound(int[] nums, int target){
            int lo = 0, hi = nums.length-1;
            int ans = -1;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                if(nums[mid]>target){
                    hi = mid-1;
                }
                else if(nums[mid]<target)
                {
                    lo = mid+1;
                }
                else{
                   ans = mid;
                    lo = mid+1;
                }
            }
            return ans;
        }
}

