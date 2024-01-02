class Solution {
    public int[] sortArray(int[] nums) {
//         int n = arr.length;

//         for (int i = 0; i < n - 1; i++) {
//             int minIndex = i;

//             for (int j = i + 1; j < n; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
            
//             if(minIndex != i){
//             // Swap the found minimum element with the element at index i
//             int temp = arr[i];
//             arr[i] = arr[minIndex];
//             arr[minIndex] = temp;
//             }
//         }
//         return arr;
        
        
        int[] count = new int[2*50001];
        for (int num: nums) count[num+50000]++;
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- != 0) {
                nums[index++] = i-50000;
            }
        }
        return nums;
    }
}

    
// count sort
