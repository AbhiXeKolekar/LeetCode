class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        int n = nums.length;
        int diff = Math.abs(target - res);
        int min_diff = diff;

        for(int i = 0; i < n - 2; i++){
            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                diff = Math.abs(target - sum);
                
                if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    right--;
                }

                if(diff < min_diff){
                    min_diff = diff;
                    res = sum;
                }
            }
        }
        return res;
    }
}