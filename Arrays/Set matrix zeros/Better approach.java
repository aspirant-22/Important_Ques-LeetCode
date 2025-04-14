class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row[] = new int[n];
        int col[] = new int[m];

        //if you get a element as 0 mark its row and col as 1
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if (matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        //if row[i] == 1 || col[j] == 1 then mark the entire row and col as 0 respectively
        for (int i = 0 ; i < n ; i++){
            for (int j = 0 ; j < m ; j++){
                if (row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
