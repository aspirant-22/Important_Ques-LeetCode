class Solution {
    public int titleToNumber(String columnTitle) {
        //Step 1: Process each character
        //Step 2: Find its value i.e val = ch - 'A' + 1
        // Step 3: result = result * 26 + val
        int result = 0;
        for (int i = 0 ; i < columnTitle.length() ; i++){
            char ch = columnTitle.charAt(i);
            int val = ch - 'A' + 1;
            result = result * 26 + val;
        }
        return result;
    }
}
