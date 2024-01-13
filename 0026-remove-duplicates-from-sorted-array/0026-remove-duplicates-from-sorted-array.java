public class Solution {
    public int removeDuplicates(int[] arr) {
    
//         int tmp = nums[0];
//         int cnt = 1;
        
//         for(int i = 1;i<nums.length;i++)
//         {
//             if(nums[i]>tmp)
//             {
//                 tmp = nums[i];
//                 nums[cnt] = tmp;
//                 cnt++;
//             }
//         }
        
//         return cnt;
        int n = arr.length;
        int i = 0;
        for(int j = 1; j<n; j++ ){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }
}
    