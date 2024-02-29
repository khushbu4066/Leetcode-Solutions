class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        
        if(n==1) return 0;
        if(arr[0] > arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;
        
        int l = 0, r = n-1, m;
        while(l<=r){
            m = (l + r)/2;
            
            if(arr[m] < arr[m + 1]){
                l = m;
            }
            else if(arr[m] < arr[m-1]){
                r = m;
            }
            else{
                return m;
            }
        }
        
        return -1;
    }
}