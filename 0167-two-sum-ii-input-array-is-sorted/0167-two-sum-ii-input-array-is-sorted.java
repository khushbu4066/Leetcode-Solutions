class Solution {
    public int[] twoSum(int[] arr, int target) {
//         int len =  numbers.length;
//         int[] result = new int [2];
//         int number1 = 0;
//         int sum = 0;
    
//     for(int i = 0; i<len; i++);{
//     number1 = numbers[i];

//     for(int j = i+1; i<len; j++);{
//     sum = number1 + numbers[j];
    
//     if (sum ==target){
//         result[0] = i;
//         result[1] = j;
//     }
//     }
//     return result;
//     }
        
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int complement = target - arr[i];
            
            if(mp.containsKey(complement)){
                return new int[] {mp.get(complement)+1, i+1};
            }
            mp.put(arr[i], i);
        }
        return new int[]{};
    }
}
