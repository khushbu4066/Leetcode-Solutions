class Solution {
    public int singleNumber(int[] arr) {
        // int x = 0;
        // int y = 0;
        // for(int i = 0; i<nums.length; i++){
        //     x = (x^nums[i]) & ~y;
        //     y = (y^nums[i]) & ~x;
        // }
        // return x;
        
       
        Arrays.sort(arr);
         int n = arr.length;
        for(int i = 0; i<n; i+=3){
            if(i+1 >= n || i+2 >= n){
                return arr[i];
            }
            if(arr[i] != arr[i+1] || arr[i] != arr[i+2]){
                return arr[i];
            }
        }
        return -1;
    }
}

