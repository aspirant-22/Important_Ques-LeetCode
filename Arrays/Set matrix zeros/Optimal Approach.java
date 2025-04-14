class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        //Make first row and col of matrix as indicators
        //col[] = matrix[0][....];
        //row[] = matrix[....][0];
        int col0 = 1; //Overlapped cell

        //if you get a element as 0 mark its row and col as 0
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0; 
                   if (j != 0){
                    matrix[0][j] = 0;
                   }
                   else{
                    col0 = 0;
                   }
                }
            }
        }

        //if row[i] == 0 || col[j] == 0 then mark the entire row and col as 0 respectively
        for (int i = 1 ; i < n ; i++){
            for (int j = 1 ; j < m ; j++){
                if (matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        //for matrix[0][0] and col0
        if (matrix[0][0] == 0){
            for (int j = 0 ; j < m ; j++){
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0){
           for (int i = 0 ; i < n ; i++){
                matrix[i][0] = 0;
            } 
        }
    }
}
