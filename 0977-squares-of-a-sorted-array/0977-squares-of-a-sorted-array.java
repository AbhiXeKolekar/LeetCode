class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        int i = 0;
        int j = 1;
        while(i < nums.length - 1){
            if(nums[i] > nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(j == nums.length - 1){
                i++;
                j = i;
            }
            j++;
        }

        return nums;
    }
}