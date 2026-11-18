class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        int right = k - 1;
        int sum = 0;
        double maxAvg = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }

        double avg = (double)sum / k;
        maxAvg = Math.max(maxAvg, avg);

        left++;
        right++;

        while(right < nums.length){
            sum -= nums[left - 1];
            sum += nums[right];

            avg = (double)sum / k;

            maxAvg = Math.max(maxAvg, avg);

            left++;
            right++;
        }

        return maxAvg;
    }
}