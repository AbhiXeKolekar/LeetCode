class Solution {
    public int removeDuplicates(int[] nums) {
        int indx1 = 0;
        int indx2 = 1;
        int count = 1;

        while(indx2 < nums.length){
            if(nums[indx1] != nums[indx2]){
                nums[indx1 + 1] = nums[indx2];
                indx1++;
                count++;
                indx2++;
            } else indx2++;
        }

        return count;
    }
}