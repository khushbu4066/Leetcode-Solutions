class Solution {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        
       if(n==1)
           return 0;
        
        for(int i = 0; i<n; i++){
            if(i==0){
            if(arr[i] >= arr[i+1]){
                return i;
            }
            }
            else if(i==n-1){
                if(arr[i] >= arr[i-1]){
                return i;
                }
            }
            else{
                if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1])
                    return i;
            }
        }
        return 1;
    }
}