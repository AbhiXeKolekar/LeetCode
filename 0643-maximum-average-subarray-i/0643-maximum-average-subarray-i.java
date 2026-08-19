class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        int max = sum;

        int left = 1;

        for(int right = k; right < nums.length; right++){
            sum += nums[right];
            sum -= nums[left - 1];

            max = Math.max(sum, max);
            left++;
        }

        return (double) max/k;
    }
}