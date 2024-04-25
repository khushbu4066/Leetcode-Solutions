public class Solution {
  public int maxSum(int[][] mat) {
//     int ans = 0;

//     for (int i = 1; i + 1 < grid.length; ++i)
//       for (int j = 1; j + 1 < grid[0].length; ++j)
//         ans = Math.max(ans, grid[i - 1][j - 1] + grid[i - 1][j] + 
//         grid[i - 1] [j + 1] + grid[i][j] + grid[i + 1][j - 1] + 
//         grid[i + 1][j] + grid[i + 1][j + 1]);

//     return ans;
      
      int r = mat.length;
      int c = mat[0].length;
      
      if(r < 3 || c < 3) return -1;
      
      int max = Integer.MIN_VALUE;
      
      for(int i = 0; i< r - 2; i++){
          for(int j = 0; j< c - 2; j++){
              
              int sum = (mat[i][j] + mat[i][j+1] + mat[i][j+2]) 
                        + (mat[i+1][j+1])+
                        (mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2]);
              
              max = Math.max(max, sum);
          }
      }
      
      return max;
      
  }
}
