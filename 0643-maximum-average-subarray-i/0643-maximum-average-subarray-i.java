class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 1; 
        int right = k;
        int sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        int max_sum = sum;

        while(right < nums.length){
            sum += nums[right];
            sum -= nums[left - 1];

            if(sum > max_sum) max_sum = sum;

            left++;
            right++;
        }

        return (double) max_sum / k;
    }
}