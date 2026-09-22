class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            int CurrentNum = nums[i];
            nums[i] += sum;
            sum += CurrentNum;
        }

        return nums;
    }
}