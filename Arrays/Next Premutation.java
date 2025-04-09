class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
       //Step1: Find the breaking point index i.e idx
       int idx = -1;
       for (int i = n-2 ; i >= 0 ; i--){
        if (nums[i] < nums[i+1]){
            idx = i;
            break;
        }
       }
       //Case 1: If no breaking pt found -> reversed array is answer
       if (idx == -1){
        reverse(nums , 0 , n-1);
        return;
       }
       //Case 2: A valid breaking pt is found
       //Find the smallest number i.e. > arr[i] and in the right half of index i(i.e. from index i+1 to n-1) and swap it with arr[i].
       int smallestIdx = Integer.MAX_VALUE;
       for (int i =  n-1 ; i >= (idx + 1) ; i--){
            if (nums[i] > nums[idx]){
                smallestIdx = i;
                break;
            }
       }
       //swap
       int temp = nums[idx];
       nums[idx] = nums[smallestIdx];
       nums[smallestIdx] = temp;
       //Reverse the right half of array from n-1 to i+1 to get ans
       reverse(nums , idx+1 , n-1);
    }
    public static void reverse(int nums[] , int startIdx , int endIdx){
        int i = startIdx;
        int j = endIdx;
        while (i < j){
            //swap
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
