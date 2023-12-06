class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        int next = 1, j = 0;
        arr[0] = 0;

        for(int i = 1; i <= n; i++){
            if(i == next){ // next Binary Cycle
                next *= 2;
                j = 0; // index used to Reuse arr
            }
            arr[i] = 1 + arr[j++];
        }
        return arr;
    }
}