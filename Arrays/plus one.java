class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int ans[] = new int[n+1];
        int carry = 0;
        for (int i = n-1 ; i >= 0 ; i--){
            int digit = digits[i];
            int sum = 0;
            if (i == n-1){
                sum = digit + 1; 
            }
            else {
                sum = digit + carry;
                carry = 0;
            }
            if (sum < 10){
                ans[i + 1] = sum;
            }
            else {
                ans[i + 1] = sum % 10;
                carry = sum / 10;
            }
        }
        if (carry != 0){
            ans[0] = carry;
            return ans;
        }
        
        int newAns[] = new int[n];
        for (int i = 1 ; i < n+1 ; i++){
            newAns[i - 1] = ans[i];
        }
        return newAns;
    }
}
