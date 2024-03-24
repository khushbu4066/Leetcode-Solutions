// class Solution {

//     public int findDuplicate(int[] nums) {
        
// //         int slow=nums[0];
// //         int fast= nums[0];
        
// //         do {
// //             slow= nums[slow];
// //             fast= nums[nums[fast]];
// //         } while(slow!=fast);
        
// //         fast= nums[0];
// //         while(slow!=fast) {
// //             slow= nums[slow];
// //             fast= nums[fast];
// //         }
// //         return slow;
//         HashMap<Integer, Integer> mp = new HashMap<>();
        
//         int n = nums.length;
//         for(int i = 0; i < n; i++){
//             mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
//         }
//         for(int i = 0; i<n; i++){
//             if(mp.get(nums[i])>1){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }

class Solution {

    public int findDuplicate(int[] nums) {
        
        int slow = nums[0];
        int fast = nums[0];
        
        slow = nums[slow];
        fast = nums[nums[fast]];
        
        while(slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        
        slow = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}