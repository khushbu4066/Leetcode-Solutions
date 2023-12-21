class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
          
        int res = 0;
        int[] temp = new int[points.length];
        
        for(int i = 0; i<points.length; i++){
            temp[i] = points[i][0];
            
        }
        Arrays.sort(temp);
        
        for(int i = 1; i<points.length; i++){
            res = Math.max(res, temp[i]-temp[i-1]);
        }
        return res;
    }
}