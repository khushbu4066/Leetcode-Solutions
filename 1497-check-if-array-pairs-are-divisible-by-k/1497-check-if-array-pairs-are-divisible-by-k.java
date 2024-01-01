class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] count = new int[k];
        for(int i=0;i<arr.length;i++){
            int val = arr[i]%k;
            if(val>=0){
                count[val]++;
            }else{
                count[val+k]++;
            }
        }

        if(count[0]%2 !=0){
            return false;
        }
        if(k%2==0 && count[k/2]%2!=0){
            return false;
        }
        int start = 1;
        int end = k-1;
        while(start<end){
            if(count[start] != count[end]){
                return false;
            }
            start++;
            end--;        
        }
        return true;

    }
}