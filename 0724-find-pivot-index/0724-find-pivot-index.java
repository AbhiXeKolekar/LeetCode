class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int[] prfArr = new int[n];
        int[] sufArr = new int[n];

        prfArr[0] = 0;
        sufArr[n - 1] = 0;

        for(int i = 1; i < n; i++){
            prfArr[i] = prfArr[i - 1] + nums[i - 1];
        }

        for(int i = n - 2; i >= 0; i--){
            sufArr[i] = sufArr[i + 1] + nums[i + 1];
        }

        int index = -1;

        for(int i = 0; i < n; i++){
            if(prfArr[i] == sufArr[i]){
                index = i;
                return index;
            }
        }

        return index;
    }
}