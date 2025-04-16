class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int sr = 0 , sc = 0 , dr = n-1 , dc = m-1 , count = 0;
        while (count < (n * m)){
            //row same - col change
            for (int i = sc ; i <= dc && count < n*m ; i++){
                ans.add(matrix[sr][i]);
                count++;
            }
            sr++;
            for (int i = sr ; i <= dr && count < n*m ; i++){
                ans.add(matrix[i][dc]);
                count++;
            }
            dc--;
            for (int i = dc ; i >= sc && count < n*m ; i--){
                ans.add(matrix[dr][i]);
                count++;
            }
            dr--;
            for (int i = dr ; i >= sr && count < n*m ; i--){
                ans.add(matrix[i][sc]);
                count++;
            }
            sc++;
        }
        
        return ans;
    }
}
