class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;

        int left = 0;
        int right = n - 1;
        int indx = n - 1;

        while(left <= right){
            int leftSqr = nums[left] * nums[left];
            int rightSqr = nums[right] * nums[right];

            if(leftSqr > rightSqr){
                res[indx] = leftSqr;
                left++;
                indx--;
            }
            else{
                res[indx] = rightSqr;
                right--;
                indx--;
            }
        }
        return res;
    }
}