class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int total = 0;
        int[] prefix_sum = new int[n];
        int[] suffix_sum = new int[n];

        prefix_sum[0] = height[0];
        suffix_sum[n - 1] = height[n - 1];

        for(int i = 1; i < n - 1; i++){
            prefix_sum[i] = Math.max(prefix_sum[i - 1], height[i]);
        }

        for(int i = n - 2; i >= 0; i--){
            suffix_sum[i] = Math.max(suffix_sum[i + 1], height[i]);
        }

        for(int i = 0; i < n - 1; i++){
            int left_max = prefix_sum[i];
            int right_max = suffix_sum[i];

            if(height[i] < left_max && height[i] < right_max){
                total += Math.min(left_max, right_max) - height[i];
            }
        }

        return total;
    }
}