class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        int a = 0;
        int n = nums.length;

        while(a < n - 3){
            long min_sum = (long) nums[a] + nums[a + 1] + nums[a + 2] + nums[a + 3];
            long max_sum = (long) nums[a] + nums[n - 1] + nums[n - 2] + nums[n - 3];

            if(min_sum > target) break;
            else if(max_sum < target){
                a++;
                continue;
            }

            int b = a + 1;

            while(b < n - 2){
                min_sum = (long) nums[a] + nums[b] + nums[b + 1] + nums[b + 2];
                max_sum = (long) nums[a] + nums[b] + nums[n - 1] + nums[n - 2];
                
                if(min_sum > target)break;
                else if(max_sum < target){
                    b++;
                    continue;
                }

                int c = b + 1;
                int d = n - 1;

                while(c < d){
                    long sum = nums[a] + nums[b] + nums[c] + nums[d];

                    if(sum == target){
                        List<Integer> quad = new ArrayList<>();
                        quad.add(nums[a]);
                        quad.add(nums[b]);
                        quad.add(nums[c]);
                        quad.add(nums[d]);

                        res.add(quad);

                        c++;
                        while(c < d && nums[c] == nums[c - 1]) c++;
                        d--;
                        while(c < d && nums[d] == nums[d + 1] && c < d) d--;
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
                b++;
                while(b < n - 2 && nums[b] == nums[b - 1]) b++;
            }
            a++;
            while(a < n - 3 && nums[a] == nums[a - 1]) a++;
        }
        return res;
    }
}