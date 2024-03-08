// class Solution {
//     public int maxFrequencyElements(int[] nums) {
        
//         int n = nums.length;
//         for(int i = 0; i<n; i++){
//             int count = 0;
//             for(int j = i; j<n; j++){
//                 if(nums[i] == nums[j]){
//                     count++;
//                 }
                
//                 return count;
//             }
//         }
//         return -1;
//     }
// }
class Solution{
public int maxFrequencyElements(int[] nums) {
    Map<Integer, Integer> frqs = new HashMap<>();
    for (int num : nums) {
        frqs.put(num, frqs.getOrDefault(num, 0) + 1);
    }
    int maxFreq = 0, cntMaxFreq = 0;
    for (int frq : frqs.values()) {
        if (frq == maxFreq) cntMaxFreq++;
        else if (frq > maxFreq) {
            maxFreq = frq;
            cntMaxFreq = 1;
        }
    }
    return maxFreq * cntMaxFreq;
}
}