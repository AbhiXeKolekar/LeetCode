class Solution {
    public int removeDuplicates(int[] nums) {
        int fix = 0;
        int search = 1;

        while(search < nums.length){
            if(nums[search] == nums[fix]) search++;
            else{
                fix++;
                nums[fix] = nums[search];
                search++;
            }
        }
        return fix + 1;
    }
}