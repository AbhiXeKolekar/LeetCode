class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;

        for(int left = 0; left < nums.length; left++){
            int right = left;
            int prod = 1;

            while(prod < k && right < nums.length){
                prod *= nums[right];
                if(prod < k) count++;
                right++;
            }
        }

        return count;
    }
}