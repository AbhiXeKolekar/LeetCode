class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int consec = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1) consec++;
            else{
                if(max < consec) max = consec;
                consec = 0;
            }
        }
        if(max < consec) max = consec;
        return max;
    }
}