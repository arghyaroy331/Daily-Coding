class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnd = 0, maxSum = Integer.MIN_VALUE;
        int minEnd = 0, minSum = Integer.MAX_VALUE;
        int ans = nums[0];
        for(int x : nums){
            maxEnd = Math.max(x, maxEnd + x);
            minEnd = Math.min(x, minEnd + x);
            maxSum = Math.max(maxSum, maxEnd);
            minSum = Math.min(minSum , minEnd);
            ans = Math.max(Math.abs(maxSum), Math.abs(minSum));
        }
        return ans;
    }
}