class Solution {
    public int matrixScore(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            if(grid[i][0]==0){
                rowFlip(grid,i);
            }
        }
        for(int i=0;i<grid[0].length;i++){
            int sum =0;
            for(int j=0;j<grid.length;j++){
                sum+=grid[j][i];
            }
            if(sum<=grid.length/2){
                colFlip(grid,i);
            }
        }
        int res =0;
        for(int []bi:grid){
            res+=decimal(bi);
        }
        return res;

    }
    public static void rowFlip(int [][]arr,int j){
        for(int i=0;i<arr[0].length;i++){
            arr[j][i]=(arr[j][i]==0?1:0);
        }
    }
    public static void colFlip(int [][]arr,int j){
        for(int i=0;i<arr.length;i++){
            arr[i][j]=(arr[i][j]==0?1:0);
        }
    }
    public int decimal(int[]binary){
        int dec = 0;
        for(int i=0;i<binary.length;i++){
            dec=dec*2+binary[i];
        }
        return dec;
    }
}