// class Solution {
//     public int[] singleNumber(int[] nums) {
        
//         int x = 0;
//         for(int num : nums){
//             x = x^num;
//         }
//         int rightSetBit = 1;
//         while((rightSetBit & x)==0){
//             rightSetBit >>=1;
//         }
//         int[] result = new int[2];
//         for(int num : nums){
//             if((num & rightSetBit)==0){
//                 result[0] ^= num;
//             }
//             else{
//                 result[1] ^= num;
//             }

//         }
//         return result;
        
//     }
// }
public class Solution {
    public int[] singleNumber(int[] nums) {
        // Step 1: Get the XOR of the two unique numbers
//         int xorResult = 0;
//         for (int num : nums) {
//             xorResult ^= num;
//         }

//         // Step 2: Find the rightmost set bit in the XOR result
//         int rightmostSetBit = 1;
//         while ((rightmostSetBit & xorResult) == 0) {
//             rightmostSetBit <<= 1;
//         }

//         // Step 3: Divide the numbers into two groups based on the rightmost set bit
//         int group1 = 0, group2 = 0;
//         for (int num : nums) {
//             if ((num & rightmostSetBit) == 0) {
//                 group1 ^= num;
//             } else {
//                 group2 ^= num;
//             }
//         }

//         return new int[]{group1, group2};
        
        
        
        
        
        
        
        
        
        int x = 0;
        for(int num:nums){
            x = x^num;
        }
        int rightmostSetBit = 1;
        while((rightmostSetBit&x)==0){
            rightmostSetBit <<= 1;
        }
        int group1 = 0, group2 = 0;
        for(int num: nums){
            if((num & rightmostSetBit)==0){
                group1 ^= num;
            }
            else{
                group2 ^= num;
            }
        }
        return new int[] {group1, group2};
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    