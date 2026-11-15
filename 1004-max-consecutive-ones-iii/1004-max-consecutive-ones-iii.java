class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int countOnes = 0;
        int countZeros = 0;
        int maxLen = 0;

        for(int right = 0; right < nums.length; right++){
            if(nums[right] == 1) countOnes++;
            else countZeros++;

            while(countZeros > k){
                if(nums[left] == 1) countOnes--;
                else countZeros--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}