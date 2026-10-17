class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }

        int left = 0;

        while(left < nums.length - 1){
            for(int right = left + 1; right < nums.length; right++){
                if(nums[right] < nums[left]){
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                }
            }
            left++;
        }

        return nums;
    }
}