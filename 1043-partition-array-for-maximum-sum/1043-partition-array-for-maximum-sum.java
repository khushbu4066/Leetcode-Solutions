// class Solution {
//     private int n;
//     private int[] t;

//     public int maxSumAfterPartitioning(int[] arr, int k) {
//         n = arr.length;
//         t = new int[501];
//         Arrays.fill(t, -1);
//         return solve(arr, 0, k);
//     }

//     private int solve(int[] arr, int idx, int k) {
//         if (idx >= n) {
//             return 0;
//         }

//         if (t[idx] != -1) {
//             return t[idx];
//         }

//         int result = 0;
//         int currMax = -1;
//         for (int i = idx; i < n && i - idx + 1 <= k; i++) {
//             currMax = Math.max(currMax, arr[i]);

//             result = Math.max(result, currMax * (i - idx + 1) + solve(arr, i + 1, k));
//         }

//         return t[idx] = result;
//     }
// }

class Solution {

    public int maxSumAfterPartitioning(int[] arr, int k) {
        
        int n = arr.length;
        int[] t = new int[n+1];
        
        for(int i = 1; i<=n; i++){
            
            int currMax = -1;
            //int result = 0;
            
            for(int j = 1; j<=k && i-j >= 0; j++){
                currMax = Math.max(currMax, arr[i-j]);
               t[i] = Math.max(t[i], t[i-j] + currMax * j);
            }
        }
        return t[n];
    }
}
