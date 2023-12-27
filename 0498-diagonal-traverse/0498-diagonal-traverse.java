class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
    
        if( matrix == null || matrix.length ==0){
            return new int[0];
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int retObject[] = new int[rows * cols];
        int index =0;
        int row =0;
        int col=0;
        
        // iterate through diagnol
        for(int pos=0; pos<retObject.length ; pos++ ){
            retObject[pos]=matrix[row][col]; 
            // If diagnoal level is Even
            if( (row+col) % 2 ==0){
                // If col reaches last col then  move down row increased;
                if(col == cols-1) row++;
                // If row reaches last row
                else if(row == 0) col++;
                else {
                    row--;
                    col++;
                }
            }else {
                // If row reaches last row then  move col to rifgh;
                if(row == rows-1) col++;
                // If row reaches last row
                else if(col == 0) row++;
                else {
                   col--;
                   row++; 
                }
            }
        }
        return retObject;
    }
}

        
