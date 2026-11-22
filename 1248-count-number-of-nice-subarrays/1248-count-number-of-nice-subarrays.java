class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k -1);
    }

    public int atMost(int[] nums, int k){
        int count = 0;
        int odds = 0;
        int left = 0;

         for(int right = 0; right < nums.length; right++){
            if(nums[right] % 2 != 0){
                odds++;
            }

            while(odds > k){
                if(nums[left] % 2 != 0){
                    odds--;
                }

                left++;
            }

            count += right - left + 1;
         }
         return count;
    }
}