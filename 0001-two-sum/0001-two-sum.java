class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> val = new HashMap<>();
        int[] res = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(val.containsKey(target - nums[i])){
                res[0] = val.get(target - nums[i]);
                res[1] = i;
                break;
            }
            val.put(nums[i], i);
        }
        return res;
    }
}