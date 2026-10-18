class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while(left <= right){
            int rightSqr = nums[right] * nums[right];
            int leftSqr = nums[left] * nums[left];

            if(leftSqr > rightSqr){
                res[index] = leftSqr;
                left++;
                index--;
            } else{
                res[index] = rightSqr;
                right--;
                index--;
            }
        }

        return res;
    }
}