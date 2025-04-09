import java.util.HashSet;
public class Solution {
    public static int longestSuccessiveElements(int []a) {
        int n = a.length;
        if (n == 0) return 0;
        //Time Complexity - O(n)
        //Step 1: Make a hashset and add elements of a in it for O(1) lookups
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0 ; i < n ; i++){
            set.add(a[i]);
        }
        //Step 2: Check if each element is starting of a sequence
        //i.e a[i]-1 is not present in array
        int max = 1;
        for (int i = 0 ; i < n ; i++){
            if (!set.contains(a[i]-1)){
                int currNum = a[i];
                int currCount = 1;
                while (set.contains(currNum + 1)){
                    currCount++;
                    currNum++;
                }
                max = Math.max(currCount , max);
            }
            
        }
        return max;
    }
}
