class Solution {
    public int heightChecker(int[] heights) {
        int count=0;
        int arr[]=new int[heights.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=heights[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}