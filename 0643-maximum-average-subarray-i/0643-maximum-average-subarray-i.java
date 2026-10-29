class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 1; 
        int right = k;
        double sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        double max_sum = sum;

        while(right < nums.length){
            sum += nums[right];
            sum -= nums[left - 1];

            if(sum > max_sum) max_sum = sum;

            left++;
            right++;
        }

        return(max_sum / k);
    }
}