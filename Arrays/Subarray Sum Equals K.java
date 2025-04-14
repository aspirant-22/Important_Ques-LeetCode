class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap <Integer , Integer> map = new HashMap<>();
        int sum = 0 , i = 0 , count = 0;
        map.put(0 , 1);
        while (i < nums.length){
            sum += nums[i];

            int rem = sum - k;
            if (map.containsKey(rem)){
                count += map.get(rem);
            }
            if (!map.containsKey(sum)){
                map.put(sum , map.getOrDefault(sum , 0)+1);
            }
            i++;
        }
        return count;
    }
}
