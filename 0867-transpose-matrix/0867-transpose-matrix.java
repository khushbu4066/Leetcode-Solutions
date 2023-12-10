class Solution {
    public int[][] transpose(int[][] A) {
        
        //Rows and columns in the original matrix
        int m = A.length;
        int n = A[0].length;
        
        //Intializing the transposed matrix with dimension swapped
        int[][] result = new int[n][m];
        
        //Iterate through each element in the original matrix
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){

            //Swap the row ans columns indices to transpose the element
                result[j][i] = A[i][j];
                
            }
        }
        //return the transpose matrix
                return result;
    }
}