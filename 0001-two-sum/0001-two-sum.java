public class Solution {
    public int[] twoSum(int[] arr, int target) {
        
//             int len = numbers.length;

//         int[] result = new int[2] ;
//         int number1 = 0;
//         int sum = 0;

//         for (int i = 0; i < len; i++) {
//             number1 = numbers[i];

//             for(int j = i+1; j < len; j++)
//             {

//                 sum = number1+numbers[j];       
//                 if(sum == target)
//                 {
//                     result[0]=i;
//                     result[1]=j;
//                 }
//             }
        
//         }
//         return result;
        
        HashMap<Integer,Integer> set = new HashMap<>();
        
        int n = arr.length;
        
        for(int i = 0; i<n; i++){
            int complement = target - arr[i];
            
            if(set.containsKey(complement)){
                return new int[]{set.get(complement),i};
            }
            set.put(arr[i], i);
        }
        return new int[]{};
    }
}