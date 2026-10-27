class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for(int a = 0; a < n - 3; a++){
            if(a > 0 && nums[a] == nums[a - 1]) continue;

            long min_sum = (long) nums[a] + nums[a + 1] + nums[a + 2] + nums[a + 3];
            long max_sum = (long) nums[a] + nums[n - 1] + nums[n - 2] + nums[n - 3];

            if(min_sum > target) break;
            else if(max_sum < target) continue;

            for(int b = a + 1; b < n - 2; b++){
                if(b > a + 1 && nums[b] == nums[b - 1]) continue;

                min_sum = (long) nums[a] + nums[b] + nums[b + 1] + nums[b + 2];
                max_sum = (long) nums[a] + nums[b] + nums[n - 1] + nums[n - 2];

                if(min_sum > target) break;
                else if(max_sum < target) continue;

                int c = b + 1;
                int d = n - 1;

                while(c < d){
                    long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];

                    if(sum == target){
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[a]);
                        quad.add(nums[b]);
                        quad.add(nums[c]);
                        quad.add(nums[d]);

                        res.add(quad);

                        c++;
                        d--;

                        while(c < d && nums[c] == nums[c - 1]) c++;
                        while(c < d && nums[d] == nums[d + 1]) d--;
                    }
                    else if(sum < target){
                        c++;
                        while(c < d && nums[c] == nums[c - 1]) c++;
                    }
                    else{
                        d--;
                        while(c < d && nums[d] == nums[d + 1]) d--;
                    }
                }
            }
        }
        return res;
    }
}