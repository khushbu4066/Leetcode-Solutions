// class Solution {
//     public int[] sortedSquares(int[] arr) {
        
//         int n = arr.length;
        
//         for(int i = 0; i<n; i++){
//             arr[i] *= arr[i];
//         }
//         Arrays.sort(arr);
        
//         return arr;
//     }
// }

// Time complexity = O(nlogn)
// Space complexity = O(n)


// 2nd Approach (Two pointer approach)
class Solution {
    public int[] sortedSquares(int[] arr) {
        
        int n = arr.length;
        
        int left = 0;
        int right = n - 1;
        int idx = n - 1;
        int[] result = new int[n];
        
        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                result[idx] = arr[left] * arr[left];
                left++;
            }
            else{
                result[idx] = arr[right] * arr[right];
                right--;
            }
            idx--;
        }
        
        return result;
        
    }
}